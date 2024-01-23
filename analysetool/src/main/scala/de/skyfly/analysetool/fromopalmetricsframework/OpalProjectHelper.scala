package de.skyfly.analysetool.fromopalmetricsframework

import com.typesafe.config.ConfigValueFactory
import org.opalj.br.analyses.{InconsistentProjectException, Project}
import org.opalj.br.{BaseConfig, ClassFile}
import org.opalj.bytecode.JRELibraryFolder
import org.opalj.log.{LogContext, OPALLogger, StandardLogContext}
import org.slf4j.{Logger, LoggerFactory}

import java.io._
import java.net.URL
import java.util.jar.JarInputStream
import scala.collection.mutable.ListBuffer
import scala.util.{Failure, Try}

object OpalProjectHelper {

  type ClassList = List[(ClassFile, URL)]

  private val log: Logger = LoggerFactory.getLogger(this.getClass)

  private val LOAD_JRE_IMPLEMENTATION = true

  private  val logCtx: LogContext = {
    val ctx = new StandardLogContext()
    OPALLogger.register(ctx, OPALLogAdapter)
    ctx
  }
  lazy val jreClasses: ClassList =
    {
      getContainerFilesRecursive(JRELibraryFolder)
        .filter(f => !f.getName.equals("jfxswt.jar")) // Do not load SWT classes, they depend on eclipse implementations
        .map(f => {
          readClassesFromContainerFile(f, LOAD_JRE_IMPLEMENTATION)
        })
        .filter(readTry => readTry match {
          case Failure(ex) =>
            log.error("Failed to load JRE library file: " + ex.getMessage)
            false
          case _ => true
        })
        .flatMap(_.get)
    }

  def readClassesFromContainerFile(file: File, loadImplementation: Boolean): Try[ClassList] = {
    if (file.getName.toLowerCase.endsWith(".jar")) {
      readJarClasses(new FileInputStream(file), file.toURI.toURL)
    }
    else {
      Failure(new IllegalStateException("Not a class container file: " + file.getName))
    }
  }

  private def isClassContainerFile(file: File) = file.getName.toLowerCase.endsWith(".jar") || file.getName.toLowerCase.endsWith(".jmod")

  private def getContainerFilesRecursive(directory: File): List[File] = {
    val directChildJars = directory.listFiles.filter(f => f.isFile && isClassContainerFile(f)).toList
    directChildJars ++ directory.listFiles.filter(_.isDirectory).flatMap(getContainerFilesRecursive).toList
  }

  def readJarClasses(jarStream: InputStream, source: URL): Try[ClassList] = Try {

    val entries = new ListBuffer[(ClassFile, URL)]()
    val jarInputStream = new JarInputStream(jarStream)
    var current = jarInputStream.getNextJarEntry
    val reader = Project.JavaClassFileReader(logCtx, BaseConfig)
    while (current != null)
      {
        val entryname = current.getName.toLowerCase
        if(entryname.endsWith(".class"))
          {
            reader
              .ClassFile(getByteStream(jarInputStream))
              .map( cf => (cf, source))
              .foreach(t => entries.append(t))
          }
        current = jarInputStream.getNextJarEntry
      }
      entries.toList


  }

  private def getByteStream(in: InputStream): DataInputStream = {

    val entbytes = {
      val baos = new ByteArrayOutputStream()
      val buffer = new Array[Byte](32 * 1024)

      LazyList.continually(in.read(buffer)).takeWhile(_ > 0).foreach { bytesRead =>
        baos.write(buffer, 0, bytesRead)
        baos.flush()
      }

      baos.toByteArray
    }
    new DataInputStream(new ByteArrayInputStream(entbytes))
  }

  def buildOPALProject(projectClasses: ClassList, thirdPartyClasses: ClassList, asLibrary: Boolean, excludeJRE: Boolean): Project[URL] = {

    val config = if (asLibrary) BaseConfig.withValue("org.opalj.br.analyses.cg.InitialEntryPointsKey.analysis",
      ConfigValueFactory.fromAnyRef("org.opalj.br.analyses.cg.LibraryEntryPointsFinder")) else BaseConfig

    val inconsistentExceptionHandler = (_: LogContext, error: InconsistentProjectException) => log.info("Inconsistent Project: " + error.message)

    val libClasses = if (excludeJRE) thirdPartyClasses else thirdPartyClasses ++ jreClasses

    Project(projectClasses, libClasses, libraryClassFilesAreInterfacesOnly = false, Iterable.empty, inconsistentExceptionHandler)(config)
  }

}
