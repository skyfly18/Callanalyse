package de.skyfly.analysetool

import java.io.File
import net.swiftzer.semver.SemVer

class SemVerOrdering extends Ordering[File]{
  override def compare(x: File, y: File): Int = {
    val xVerOptNoJ = x.getName.toLowerCase().replace(".jar","")
    val yVerOptNoJ= y.getName.toLowerCase().replace(".jar", "")

    val xVerOptNoP = xVerOptNoJ.split("-")
    val yVerOptNoP = yVerOptNoJ.split("-")

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
    semX.compareTo(semY)




  }
}
