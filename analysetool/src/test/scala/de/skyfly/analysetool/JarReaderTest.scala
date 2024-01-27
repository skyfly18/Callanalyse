package de.skyfly.analysetool

import de.skyfly.analysetool.application.JarReader
import org.junit.runner.RunWith
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class JarReaderTest extends AnyFlatSpec with Matchers{

  "The JarReader" must "calculate valid results for a patch Update" in {

    val reader = new JarReader(getClass.getResource("/patch").getPath)
    val result = reader.calculateCallGraphMetric()
    assertResult(2){result.jarCount}
    assertResult(8){result.getMeanSumMethodePatch}
    assertResult(3){result.getMeanSumClassPatch}

    assertResult(2){result.getMeanModiMethodePatch}

    assertResult(25){result.getPercentModiMethodePatch}


  }

  "The JarReader" must "calculate valid results for a minor Update" in {

    val reader = new JarReader(getClass.getResource("/minor").getPath)
    val result = reader.calculateCallGraphMetric()
    assertResult(2){result.jarCount}
    assertResult(13){result.getMeanSumMethodeMinor}
    assertResult(4){result.getMeanSumClassMinor}

    assertResult(2){result.getMeanModiMethodeMinor}
    assertResult(2){result.getMeanAddMethodeMinor}
    assertResult(5){result.getMeanAllAddMethodeMinor}
    assertResult(3){result.getMeanAddMethodeByClassMinor}
    assertResult(1){result.getMeanAddClassMinor}

    assertResult(15.385){result.getPercentAddMethodeMinor}
    assertResult(15.385){result.getPercentModiMethodeMinor}
    assertResult(23.077){result.getPercentAddMethodeByClassMinor}
    assertResult(38.462){result.getPercentAddAllMethodeMinor}
    assertResult(25){result.getPercentAddClassMinor}

  }


  "The JarReader" must "calculate valid results for a Mayor Update" in {

    val reader = new JarReader(getClass.getResource("/mayor").getPath)
    val result = reader.calculateCallGraphMetric()
    assertResult(2){result.jarCount}
    assertResult(12){result.getMeanSumMethodeMayor}
    assertResult(3){result.getMeanSumClassMayor}


    assertResult(2){result.getMeanModiMethodeMayor}
    assertResult(0){result.getMeanAddMethodeMayor}
    assertResult(7){result.getMeanAllAddMethodeMayor}
    assertResult(7){result.getMeanAddMethodeByClassMayor}
    assertResult(1){result.getMeanAddClassMayor}
    assertResult(3){result.getMeanDeleteMethodeByClassMayor}


    assertResult(0){result.getPercentAddMethodeMayor}
    assertResult(16.667){result.getPercentModiMethodeMayor}
    assertResult(58.333){result.getPercentAddMethodeByClassMayor}
    assertResult(58.333){result.getPercentAddAllMethodeMayor}
    assertResult(33.333){result.getPercentAddClassMayor}
    assertResult(25){result.getPercentDeleteMethodeByClassMayor}
  }

  "The JarReader" must "calculate valid results for a all Update" in {

    val reader = new JarReader(getClass.getResource("/all").getPath)
    val result = reader.calculateCallGraphMetric()

    assertResult(4){result.jarCount}
    assertResult(12){result.getMeanSumMethodeMayor}
    assertResult(3){result.getMeanSumClassMayor}


    assertResult(5){result.getMeanModiMethodeMayor}
    assertResult(4){result.getMeanAddMethodeMayor}
    assertResult(4){result.getMeanAllAddMethodeMayor}
    assertResult(0){result.getMeanAddMethodeByClassMayor}
    assertResult(0){result.getMeanAddClassMayor}
    assertResult(4){result.getMeanDeleteMethodeByClassMayor}

    assertResult(2){result.getMeanModiMethodeMinor}
    assertResult(2){result.getMeanAddMethodeMinor}
    assertResult(5){result.getMeanAllAddMethodeMinor}
    assertResult(3){result.getMeanAddMethodeByClassMinor}
    assertResult(1){result.getMeanAddClassMinor}

    assertResult(8){result.getMeanSumMethodePatch}
    assertResult(3){result.getMeanSumClassPatch}

    assertResult(2){result.getMeanModiMethodePatch}

    assertResult(25){result.getPercentModiMethodePatch}
    assertResult(15.385){result.getPercentAddMethodeMinor}
    assertResult(15.385){result.getPercentModiMethodeMinor}
    assertResult(23.077){result.getPercentAddMethodeByClassMinor}
    assertResult(38.462){result.getPercentAddAllMethodeMinor}
    assertResult(25){result.getPercentAddClassMinor}

    assertResult(33.333){result.getPercentAddMethodeMayor}
    assertResult(41.667){result.getPercentModiMethodeMayor}
    assertResult(0){result.getPercentAddMethodeByClassMayor}
    assertResult(33.333){result.getPercentAddAllMethodeMayor}
    assertResult(0){result.getPercentAddClassMayor}
    assertResult(33.333){result.getPercentDeleteMethodeByClassMayor}

  }

  "The JarReader" must "throw a Exception" in {
    intercept[Exception] {
      val reader = new JarReader(getClass.getResource("/notSemVer").getPath)
      val result = reader.calculateCallGraphMetric()
    }
  }
  "The JarReader" must " not throw a Exception" in {
      val reader = new JarReader(getClass.getResource("/SemVer").getPath)
      val result = reader.calculateCallGraphMetric()
      println(result)

  }









}
