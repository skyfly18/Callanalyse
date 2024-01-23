package de.skyfly.analysetool.application

import de.skyfly.analysetool.result.ResultPackage
import net.swiftzer.semver.SemVer
import org.opalj.br.analyses.Project
import org.opalj.br.instructions.{INVOKEDYNAMIC, INVOKEINTERFACE, INVOKESPECIAL, INVOKESTATIC, INVOKEVIRTUAL}

import java.io.File
import java.net.URL
import scala.collection.mutable.ListBuffer

class MetricsAnalyse {

  private var previousPackages: Map [String, Map[String, ListBuffer[(String,String, String)]]] = Map[String, Map[String, ListBuffer[(String,String, String)]]]()
  private var previousClassCount: Int = 0
  private var previousMethodeCount: Int = 0

  private val resultMetricsList: ListBuffer[ResultMetrics] = ListBuffer[ResultMetrics]()

  private var previousJarString: File = null




  def analyse(project: Project[URL], file: File): Unit = {


    var currentPackagesEdgePackages: Map [String, Map[String, ListBuffer[(String,String, String)]]] = Map[String, Map[String, ListBuffer[(String,String, String)]]]()

    project.allClassFiles
      .foreach(file =>{
        val currentMethodeClass = ListBuffer[(String, String, String)]()
        var currentMethode = Map[String, ListBuffer[(String, String, String)]]()
        file.methods.foreach(
          method =>{
            method.body match {
              case None =>
              case Some(code) => code.instructions.foreach
                {
                  case invokevirtual: INVOKEVIRTUAL =>
                    val tuple = (invokevirtual.declaringClass.mostPreciseObjectType.fqn, invokevirtual.name, invokevirtual.methodDescriptor.toString())
                    currentMethodeClass.append(tuple)
                  case invokeinterface: INVOKEINTERFACE =>
                    val tuple = ( invokeinterface.declaringClass.fqn, invokeinterface.name, invokeinterface.methodDescriptor.toString())
                    currentMethodeClass.append(tuple)
                  case invokespecial: INVOKESPECIAL =>
                    val tuple = ( invokespecial.declaringClass.fqn, invokespecial.name, invokespecial.methodDescriptor.toString())
                    currentMethodeClass.append(tuple)
                  case invokestatic: INVOKESTATIC =>
                    val tuple = (invokestatic.declaringClass.fqn, invokestatic.name, invokestatic.methodDescriptor.toString())
                    currentMethodeClass.append(tuple)
                  case invokedynamic: INVOKEDYNAMIC =>
                    val tuple = ("invokedynamic" , invokedynamic.name, invokedynamic.methodDescriptor.toString())
                    currentMethodeClass.append(tuple)
                  case _=>
                }
              }
            currentMethode = currentMethode + (method.name -> currentMethodeClass)

            }



          )
        currentPackagesEdgePackages = currentPackagesEdgePackages + (file.fqn -> currentMethode)
      })
    val workCurrentPackages = currentPackagesEdgePackages
    val workPrevious = previousPackages

    var deleteClass = 0
    var addClass = 0
    var addMethode = 0
    var deleteMethode = 0
    var modiMethode = 0

    var addMethodeByClass = 0
    var deleteMethodeByClass = 0


    previousPackages.keys.foreach(elem =>{

      if (workCurrentPackages.contains(elem))
        {
          workPrevious.get(elem).foreach(methodeall =>{
            methodeall.keys.foreach(key =>{
              val workCurrentClass = workCurrentPackages(elem)
              if(workCurrentClass.contains(key))
                {
                  var found = false
                  methodeall.get(key).foreach(edgeOld => {
                    workCurrentClass.get(key).foreach(edge => {
                      if (edgeOld.equals(edge)) {
                        found = true

                      }

                    })

                  })
                  if(!found)
                    {
                      modiMethode += 1
                    }

                }
              else
                {
                  deleteMethode += 1
                }



            })

          })
        }
      else
        {

          deleteClass += 1
          workPrevious.get(elem).foreach(methodeAll =>
            methodeAll.keys.foreach(_ =>deleteMethodeByClass += 1))

        }
    }

    )

    currentPackagesEdgePackages.keys.foreach(elem =>
    {
      if(previousPackages.contains(elem))
        {
          workCurrentPackages.get(elem).foreach(methodeall =>{
            methodeall.keys.foreach(key =>
            {
              val workpreviousClass = previousPackages(elem)
              if(!workpreviousClass.contains(key))
                {
                  addMethode += 1
                }
            })

          })
        }
      else
        {
          addClass += 1

          workCurrentPackages.get(elem).foreach(methodeall => {
            methodeall.keys.foreach(_ => {
              addMethodeByClass += 1

            })
          })

        }

    })
    val currentClassCount = project.projectClassFilesCount
    val currentMethodeCount = project.projectMethodsCount
    var patchLevel:Int = 0
    if(previousJarString != null) {
      val xVerOptNoP = previousJarString.getName.toLowerCase().replace(".jar","").split("-")
      val yVerOptNoP = file.getName.toLowerCase().replace(".jar", "").split("-")

      var xVerOpt = ""
      var yVerOpt = ""


      for(n <- 0 until  xVerOptNoP.size-1)
      {
        if(xVerOptNoP(n).contains("."))
        {
          xVerOpt += xVerOptNoP(n) + "-"
        }
      }
      xVerOpt += xVerOptNoP.last

      for(n <- 0 until  yVerOptNoP.size-1)
      {
        if(yVerOptNoP(n).contains("."))
        {
          yVerOpt += yVerOptNoP(n) + "-"
        }
      }
      yVerOpt += yVerOptNoP.last

      val semX = SemVer.parse(xVerOpt)
      val semY = SemVer.parse(yVerOpt)

      val semP = semX.getPreRelease


      if( semX.getMajor < semY.getMajor)
        {
          patchLevel = 1

        }
      else if( semX.getMinor < semY.getMinor)
        {
          patchLevel = 2

        }
      else if(semX.getPatch < semY.getPatch)
        {
          patchLevel = 3
        }
      else if((semY.getPreRelease != null && semX.getPreRelease != null) || (semY.getBuildMetadata != null && semX.getBuildMetadata != null))
        {
          patchLevel = 4
        }
      else if((semX.getBuildMetadata != null && semX.getPreRelease != null) || (semY.getPreRelease == null))
        {
        patchLevel = 5
        }


    }

    resultMetricsList.append(new ResultMetrics(deleteClass = deleteClass, addClass = addClass,
      deleteMethode = deleteMethode, addMethode = addMethode, modiMethode = modiMethode,
      previousClassCount = previousClassCount, previousMethodeCount = previousMethodeCount,
      currentClassCount = currentClassCount, currentMethodeCount = currentMethodeCount, patchLevel = patchLevel,
      addMethodeByClass = addMethodeByClass, deleteMethodeByClass = deleteMethodeByClass
    ))
    previousPackages = currentPackagesEdgePackages
    previousClassCount = currentClassCount
    previousMethodeCount = currentMethodeCount
    previousJarString = file

  }

  def getResult: ResultPackage = {

    val resultPackage = new ResultPackage()

    resultMetricsList.foreach(result =>{
      result.patchLevel match {

        case 1 =>
          resultPackage.addMayor(addClass = result.addClass, deleteClass = result.deleteMethode, addMethode = result.addMethode,
            deleteMethode = result.deleteMethode, modiMethode = result.modiMethode, countClass = result.currentClassCount,
            countMethode = result.currentMethodeCount, addMethodeByClass = result.addMethodeByClass, deleteMethodeByClass = result.deleteMethodeByClass)


        case 2 => resultPackage.addMinor(addClass = result.addClass, deleteClass = result.deleteMethode, addMethode = result.addMethode,
          deleteMethode = result.deleteMethode, modiMethode = result.modiMethode, countClass = result.currentClassCount,
          countMethode = result.currentMethodeCount, addMethodeByClass = result.addMethodeByClass, deleteMethodeByClass = result.deleteMethodeByClass)
        case 3 => resultPackage.addPatch(addClass = result.addClass, deleteClass = result.deleteMethode, addMethode = result.addMethode,
          deleteMethode = result.deleteMethode, modiMethode = result.modiMethode, countClass = result.currentClassCount,
          countMethode = result.currentMethodeCount, addMethodeByClass = result.addMethodeByClass, deleteMethodeByClass = result.deleteMethodeByClass)
        case _ =>
      }

    })

    resultPackage.jarCount = resultMetricsList.toList.size
    resultPackage




  }




}
