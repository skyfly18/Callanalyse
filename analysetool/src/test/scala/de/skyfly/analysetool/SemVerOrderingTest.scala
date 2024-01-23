package de.skyfly.analysetool

import org.junit.runner.RunWith
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.junit.JUnitRunner

import java.io.{File, FilenameFilter}
import java.nio.file.{DirectoryStream, Files, Path, Paths}



@RunWith(classOf[JUnitRunner])
class SemVerOrderingTest extends AnyFlatSpec with Matchers{

  "The AVGFanInAnalysis" must "calculate valid results for single JARs" in {
    val path2 = new File(getClass.getResource("/gson").getPath)
    println(path2)
  }







}
