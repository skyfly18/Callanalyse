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


    var foundX =false
    for(n <- 0 until  xVerOptNoP.size-1) {

      if (foundX) {
      xVerOpt += xVerOptNoP(n)
      }
      if (xVerOptNoP(n).contains(".") && !foundX) {
        xVerOpt += xVerOptNoP(n) + "-"
        foundX = true

      }

    }
    xVerOpt += xVerOptNoP.last

    var found =false
    for(n <- 0 until  yVerOptNoP.size-1)
    {
      if (found)
      {
        yVerOpt += yVerOptNoP(n)
      }

      if(yVerOptNoP(n).contains(".") && !found)
      {
        yVerOpt += yVerOptNoP(n) + "-"
        found = true
      }

    }
    yVerOpt += yVerOptNoP.last


    val semX = SemVer.parse(xVerOpt)
    val semY = SemVer.parse(yVerOpt)
    semX.compareTo(semY)




  }
}
