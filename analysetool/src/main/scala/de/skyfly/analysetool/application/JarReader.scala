package de.skyfly.analysetool.application

import de.skyfly.analysetool.SemVerOrdering
import de.skyfly.analysetool.fromopalmetricsframework.OpalProjectHelper
import de.skyfly.analysetool.result.ResultPackage
import org.opalj.br.ClassFile

import java.io.{File, FileInputStream, FilenameFilter}
import java.net.URL

/**
 *
 * @param inputFilePath
 */
class JarReader(inputFilePath:String)
{

  val inputJarList: File = new File(inputFilePath)

  protected def fileOrdering = new SemVerOrdering()

  protected def fileFilter: (File, String) => Boolean = (_, name) => name.toLowerCase().endsWith(".jar")

  /**
   *
   * @return
   */
  def getSortedJarList: List[File] = {

    inputJarList.listFiles(new FilenameFilter {
      override def accept(dir: File, name: String): Boolean = fileFilter(dir, name)
    }).sorted(fileOrdering)
      .toList

  }

  /**
   * 
   * @return
   */

  def calculateCallGraphMetric(): ResultPackage = {
    val listJar = getSortedJarList
    val analyse = new MetricsAnalyse
    listJar.foreach {
      file =>
        val projectClasses = OpalProjectHelper.readJarClasses(new FileInputStream(file), file.toURI.toURL)
        val project = OpalProjectHelper.buildOPALProject(projectClasses.get, List[(ClassFile, URL)](), asLibrary = true, excludeJRE = true)
        analyse.analyse(project, file)
    }
    val result = analyse.getResult
    result
  }


}
