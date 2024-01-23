package de.skyfly.analysetool.result


class ResultPackage(

                   ) {

  private var countMayorUpdate = 0
  private var countMinorUpdate = 0
  private var countPatchUpdate = 0



  var jarCount: Int = 0



  private var sumAddClassMayor = 0
  private var sumDeleteClassMayor = 0
  private var sumAddMethodeMayor = 0
  private var sumDeleteMethodeMayor = 0
  private var sumModiMethodeMayor = 0
  private var countClassMayor = 0
  private var countMethodeMayor = 0
  private var sumAddMethodeByClassMayor = 0
  private var sumDeleteMethodeByClassMayor = 0

  private var sumAddClassMinor = 0
  private var sumDeleteClassMinor = 0
  private var sumAddMethodeMinor = 0
  private var sumDeleteMethodeMinor = 0
  private var sumModiMethodeMinor = 0
  private var countClassMinor = 0
  private var countMethodeMinor = 0
  private var sumAddMethodeByClassMinor = 0
  private var sumDeleteMethodeByClassMinor = 0

  private var sumAddClassPatch = 0
  private var sumDeleteClassPatch = 0
  private var sumAddMethodePatch = 0
  private var sumDeleteMethodePatch = 0
  private var sumModiMethodePatch = 0
  private var countClassPatch = 0
  private var countMethodePatch = 0
  private var sumAddMethodeByClassPatch = 0
  private var sumDeleteMethodeByClassPatch = 0



  def addMayor( addClass:Int, deleteClass:Int, addMethode: Int, deleteMethode: Int, modiMethode:Int,
                countClass:Int, countMethode:Int, addMethodeByClass:Int, deleteMethodeByClass: Int): Unit = {

    sumAddClassMayor += addClass
    sumDeleteClassMayor += deleteClass
    sumAddMethodeMayor += addMethode
    sumDeleteMethodeMayor += deleteMethode
    sumModiMethodeMayor += modiMethode
    countClassMayor += countClass
    countMethodeMayor += countMethode
    sumAddMethodeByClassMayor += addMethodeByClass
    sumDeleteMethodeByClassMayor += deleteMethodeByClass

    countMayorUpdate += 1

  }

  def addMinor( addClass:Int, deleteClass:Int, addMethode: Int, deleteMethode: Int, modiMethode:Int, countClass:Int,
                countMethode:Int, addMethodeByClass:Int, deleteMethodeByClass: Int): Unit = {

    sumAddClassMinor += addClass
    sumDeleteClassMinor += deleteClass
    sumAddMethodeMinor += addMethode
    sumDeleteMethodeMinor += deleteMethode
    sumModiMethodeMinor += modiMethode
    countClassMinor += countClass
    countMethodeMinor += countMethode
    sumAddMethodeByClassMinor += addMethodeByClass
    sumDeleteMethodeByClassMinor += deleteMethodeByClass

    countMinorUpdate += 1

  }



  def addPatch(addClass:Int, deleteClass:Int, addMethode: Int, deleteMethode: Int, modiMethode:Int, countClass:Int,
               countMethode:Int, addMethodeByClass:Int, deleteMethodeByClass: Int): Unit = {

    sumAddClassPatch += addClass
    sumDeleteClassPatch += deleteClass
    sumAddMethodePatch += addMethode
    sumDeleteMethodePatch += deleteMethode
    sumModiMethodePatch += modiMethode
    countClassPatch += countClass
    countMethodePatch += countMethode
    sumAddMethodeByClassPatch += addMethodeByClass
    sumDeleteMethodeByClassPatch += deleteMethodeByClass

    countPatchUpdate += 1



  }



  def getCountMayorUpdate: Int =
    {
      countMayorUpdate
    }

  def getCountMinorUpdate: Int = {
    countMinorUpdate
  }

  def getCountPatchUpdate: Int =
    {
      countPatchUpdate
    }

  //Mayor

  def getMeanAddClassMayor: Int ={
      if(sumAddClassMayor !=0 && countMayorUpdate !=0)
        {
          val mean = sumAddClassMayor / countMayorUpdate
          return mean
        }
        return 0
  }


  def getMeanDeleteClassMayor: Int ={
    if(sumDeleteClassMayor !=0 && countMayorUpdate !=0)
    {
      val mean = sumDeleteClassMayor / countMayorUpdate
      return mean
    }
    return 0
  }

  def getMeanAddMethodeMayor: Int ={
    if(sumAddMethodeMayor !=0 && countMayorUpdate !=0)
    {
      val mean = sumAddMethodeMayor / countMayorUpdate
      return mean
    }
    return 0
  }

  def getMeanDeleteMethodeMayor: Int ={
    if(sumDeleteMethodeMayor !=0 && countMayorUpdate !=0)
    {
      val mean = sumDeleteMethodeMayor / countMayorUpdate
      return mean
    }
    return 0
  }

  def getMeanModiMethodeMayor: Int ={
    if(sumModiMethodeMayor !=0 && countMayorUpdate !=0)
    {
      val mean = sumModiMethodeMayor / countMayorUpdate
      return mean
    }
    return 0
  }

  def getMeanAddMethodeByClassMayor:Int = {
    if(sumAddMethodeByClassMayor !=0 && countMayorUpdate !=0)
    {
      val mean = sumAddMethodeByClassMayor / countMayorUpdate
      return mean
    }
    return 0
  }

  def getMeanDeleteMethodeByClassMayor:Int = {
    if(sumDeleteMethodeByClassMayor !=0 && countMayorUpdate !=0)
    {
      val mean = sumDeleteMethodeByClassMayor / countMayorUpdate
      return mean
    }
    return 0
  }


  def getMeanAllAddMethodeMayor:Int = {
    val add = sumAddMethodeByClassMayor + sumAddMethodeMayor
    if(add !=0 && countMayorUpdate !=0)
    {
      val mean = add / countMayorUpdate
      return mean
    }
    return 0
  }

  def getMeanAllDeleteMethodeMayor:Int = {
    val add = sumDeleteMethodeByClassMayor + sumDeleteMethodeMayor
    if(add !=0 && countMayorUpdate !=0)
    {
      val mean =  add / countMayorUpdate
      return mean
    }
    return 0
  }

  def getMeanAllChangeMethodeMayor:Int = {
    val add = sumDeleteMethodeByClassMayor + sumDeleteMethodeMayor + sumAddMethodeByClassMayor + sumModiMethodeMayor + sumAddMethodeMayor
    if(add !=0 && countMayorUpdate !=0)
    {
      val mean =  add / countMayorUpdate
      return mean
    }
    return 0
  }


  def getMeanAllChangeNoClassMethodeMayor:Int = {
    val add =  sumDeleteMethodeMayor  + sumModiMethodeMayor + sumAddMethodeMayor
    if(add !=0 && countMayorUpdate !=0)
    {
      val mean =  add / countMayorUpdate
      return mean
    }
    return 0
  }

  def getMeanSumMethodeMayor: Int ={
    if(countMethodeMayor !=0 && countMayorUpdate !=0)
    {
      val mean = countMethodeMayor / countMayorUpdate
      return mean
    }
    return 0
  }

  def getMeanSumClassMayor: Int ={
    if(countClassMayor !=0 && countMayorUpdate !=0)
    {
      val mean = countClassMayor / countMayorUpdate
      return mean
    }
    return 0
  }

//Minor

  def getMeanAddClassMinor: Int ={
    if(sumAddClassMinor !=0 && countMinorUpdate !=0)
    {
      val mean = sumAddClassMinor / countMinorUpdate
      return mean
    }
    return 0
  }

  def getMeanDeleteClassMinor: Int ={
    if(sumDeleteClassMinor !=0 && countMinorUpdate !=0)
    {
      val mean = sumDeleteClassMinor / countMinorUpdate
      return mean
    }
    return 0
  }

  def getMeanAddMethodeMinor: Int ={
    if(sumAddMethodeMinor !=0 && countMinorUpdate !=0)
    {
      val mean = sumAddMethodeMinor / countMinorUpdate
      return mean
    }
    return 0
  }

  def getMeanDeleteMethodeMinor: Int ={
    if(sumDeleteMethodeMinor !=0 && countMinorUpdate !=0)
    {
      val mean = sumDeleteMethodeMinor / countMinorUpdate
      return mean
    }
    return 0
  }

  def getMeanModiMethodeMinor: Int ={
    if(sumModiMethodeMinor !=0 && countMinorUpdate !=0)
    {
      val mean = sumModiMethodeMinor / countMinorUpdate
      return mean
    }
    return 0
  }

  def getMeanAddMethodeByClassMinor:Int = {
    if(sumAddMethodeByClassMinor !=0 && countMinorUpdate !=0)
    {
      val mean = sumAddMethodeByClassMinor / countMinorUpdate
      return mean
    }
    return 0
  }

  def getMeanDeleteMethodeByClassMinor:Int = {
    if(sumDeleteMethodeByClassMinor !=0 && countMinorUpdate !=0)
    {
      val mean = sumDeleteMethodeByClassMinor / countMinorUpdate
      return mean
    }
    return 0
  }


  def getMeanAllAddMethodeMinor:Int = {
    val add = (sumAddMethodeByClassMinor + sumAddMethodeMinor)
    if(add !=0 && countMinorUpdate !=0)
    {
      val mean = add / countMinorUpdate
      return mean
    }
    return 0
  }

  def getMeanAllDeleteMethodeMinor:Int = {
    val add = (sumDeleteMethodeByClassMinor + sumDeleteMethodeMinor)
    if(add !=0 && countMinorUpdate !=0)
    {
      val mean = add / countMinorUpdate
      return mean
    }
    return 0
  }

  def getMeanAllChangeMethodeMinor:Int = {
    val add = (sumDeleteMethodeByClassMinor + sumDeleteMethodeMinor + sumAddMethodeByClassMinor + sumAddMethodeMinor + sumModiMethodeMinor)
    if(add !=0 && countMinorUpdate !=0)
    {
      val mean = add / countMinorUpdate
      return mean
    }
    return 0
  }

  def getMeanAllChangeMethodeNoClassMinor:Int = {
    val add = (sumDeleteMethodeMinor + sumAddMethodeMinor + sumModiMethodeMinor)
    if(add !=0 && countMinorUpdate !=0)
    {
      val mean = add / countMinorUpdate
      return mean
    }
    return 0
  }

  def getMeanSumMethodeMinor: Int ={
    if(countMethodeMinor !=0 && countMinorUpdate !=0)
    {
      val mean = countMethodeMinor / countMinorUpdate
      return mean
    }
    return 0
  }

  def getMeanSumClassMinor: Int ={
    if(countClassMinor !=0 && countMinorUpdate !=0)
    {
      val mean = countClassMinor / countMinorUpdate
      return mean
    }
    return 0
  }



//Patch


  def getMeanAddClassPatch: Int ={
    if(sumAddClassPatch !=0 && countPatchUpdate !=0)
    {
      val mean = sumAddClassPatch / countPatchUpdate
      return mean
    }
    return 0
  }


  def getMeanDeleteClassPatch: Int ={
    if(sumDeleteClassPatch !=0 && countPatchUpdate !=0)
    {
      val mean = sumDeleteClassPatch / countPatchUpdate
      return mean
    }
    return 0
  }

  def getMeanAddMethodePatch: Int ={
    if(sumAddMethodePatch !=0 && countPatchUpdate !=0)
    {
      val mean = sumAddMethodePatch / countPatchUpdate
      return mean
    }
    return 0
  }

  def getMeanDeleteMethodePatch: Int ={
    if(sumDeleteMethodePatch !=0 && countPatchUpdate !=0)
    {
      val mean = sumDeleteMethodePatch / countPatchUpdate
      return mean
    }
    return 0
  }

  def getMeanModiMethodePatch: Int ={
    if(sumModiMethodePatch !=0 && countPatchUpdate !=0)
    {
      val mean = sumModiMethodePatch / countPatchUpdate
      return mean
    }
    return 0
  }

  def getMeanAddMethodeByClassPatch:Int = {
    if(sumAddMethodeByClassPatch !=0 && countPatchUpdate !=0)
    {
      val mean = sumAddMethodeByClassPatch / countPatchUpdate
      return mean
    }
    return 0
  }

  def getMeanDeleteMethodeByClassPatch:Int = {
    if(sumDeleteMethodeByClassPatch !=0 && countPatchUpdate !=0)
    {
      val mean = sumDeleteMethodeByClassPatch / countPatchUpdate
      return mean
    }
    return 0
  }


  def getMeanAllAddMethodePatch:Int = {
    val add = sumAddMethodePatch + sumAddMethodeByClassPatch
    if(add !=0 && countPatchUpdate !=0)
    {
      val mean = add / countPatchUpdate
      return mean
    }
    return 0
  }

  def getMeanAllDeleteMethodePatch:Int = {

    val add = (sumDeleteMethodeByClassPatch + sumDeleteMethodePatch)
    if(add !=0 && countPatchUpdate !=0)
    {
      val mean = add / countPatchUpdate
      return mean
    }
    return 0
  }

  def getMeanAllChangeMethodePatch:Int = {

    val add = (sumDeleteMethodeByClassPatch + sumDeleteMethodePatch + sumAddMethodeByClassPatch + sumModiMethodePatch + sumAddMethodePatch)
    if(add !=0 && countPatchUpdate !=0)
    {
      val mean = add / countPatchUpdate
      return mean
    }
    return 0
  }

  def getMeanAllChangeNoClassMethodePatch:Int = {

    val add = ( sumDeleteMethodePatch + sumModiMethodePatch + sumAddMethodePatch)
    if(add !=0 && countPatchUpdate !=0)
    {
      val mean = add / countPatchUpdate
      return mean
    }
    return 0
  }

  def getMeanSumMethodePatch: Int ={
    if(countMethodePatch !=0 && countPatchUpdate !=0)
    {
      val mean = countMethodePatch / countPatchUpdate
      return mean
    }
    return 0
  }

  def getMeanSumClassPatch: Int ={
    if(countClassPatch !=0 && countPatchUpdate !=0)
    {
      val mean = countClassPatch / countPatchUpdate
      return mean
    }
    return 0
  }


  //Prozent

  def getPercentAddClassMayor:Double =
    {
      val meanP = getMeanAddClassMayor.toDouble
      val meanB = getMeanSumClassMayor.toDouble
      if(meanB !=0 && meanP !=0)
        {
          val result:Double = (meanP*100)/meanB
          return (result *1000).round / 1000.0
        }
      return 0
    }

  def getPercentDeleteClassMayor:Double =
  {
    val meanP = getMeanDeleteClassMayor.toDouble
    val meanB = getMeanSumClassMayor.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentAddMethodeMayor:Double =
  {
    val meanP = getMeanAddMethodeMayor.toDouble
    val meanB = getMeanSumMethodeMayor.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentDeleteMethodeMayor:Double =
  {
    val meanP = getMeanDeleteMethodeMayor.toDouble
    val meanB = getMeanSumMethodeMayor.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentModiMethodeMayor:Double =
  {
    val meanP = getMeanModiMethodeMayor.toDouble
    val meanB = getMeanSumMethodeMayor.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentAddMethodeByClassMayor:Double =
  {
    val meanP = getMeanAddMethodeByClassMayor.toDouble
    val meanB = getMeanSumMethodeMayor.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentDeleteMethodeByClassMayor:Double =
  {
    val meanP = getMeanDeleteMethodeByClassMayor.toDouble
    val meanB = getMeanSumMethodeMayor.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }




  def getPercentAddAllMethodeMayor:Double =
  {
    val meanP = getMeanAllAddMethodeMayor.toDouble
    val meanB = getMeanSumMethodeMayor.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentDeleteAllMethodeMayor:Double =
  {
    val meanP = getMeanAllDeleteMethodeMayor.toDouble
    val meanB = getMeanSumMethodeMayor.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentAllChangeNoClassMayor:Double =
  {
    val meanP = getMeanAllChangeNoClassMethodeMayor.toDouble
    val meanB = getMeanSumMethodeMayor.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentAllChangeMayor:Double =
  {
    val meanP = getMeanAllChangeMethodeMayor.toDouble
    val meanB = getMeanSumMethodeMayor.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }



  //minor

  def getPercentAddClassMinor:Double =
  {
    val meanP = getMeanAddClassMinor.toDouble
    val meanB = getMeanSumClassMinor.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentDeleteClassMinor:Double =
  {
    val meanP = getMeanDeleteClassMinor.toDouble
    val meanB = getMeanSumClassMinor.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentAddMethodeMinor:Double =
  {
    val meanP = getMeanAddMethodeMinor.toDouble
    val meanB = getMeanSumMethodeMinor.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentDeleteMethodeMinor:Double =
  {
    val meanP = getMeanDeleteMethodeMinor.toDouble
    val meanB = getMeanSumMethodeMinor.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentModiMethodeMinor:Double =
  {
    val meanP = getMeanModiMethodeMinor.toDouble
    val meanB = getMeanSumMethodeMinor.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentAddMethodeByClassMinor:Double =
  {
    val meanP = getMeanAddMethodeByClassMinor.toDouble
    val meanB = getMeanSumMethodeMinor.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentDeleteMethodeByClassMinor:Double =
  {
    val meanP = getMeanDeleteMethodeByClassMinor.toDouble
    val meanB = getMeanSumMethodeMinor.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }


  def getPercentAddAllMethodeMinor:Double =
  {
    val meanP = getMeanAllAddMethodeMinor.toDouble
    val meanB = getMeanSumMethodeMinor.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentDeleteAllMethodeMinor:Double =
  {
    val meanP = getMeanAllDeleteMethodeMinor.toDouble
    val meanB = getMeanSumMethodeMinor.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentAllChangeNoClassMinor:Double =
  {
    val meanP = getMeanAllChangeMethodeNoClassMinor.toDouble
    val meanB = getMeanSumMethodeMinor.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentAllChangeMinor:Double =
  {
    val meanP = getMeanAllChangeMethodeMinor.toDouble
    val meanB = getMeanSumMethodeMinor.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

//Patch

  def getPercentAddClassPatch:Double =
  {
    val meanP = getMeanAddClassPatch.toDouble
    val meanB = getMeanSumClassPatch.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentDeleteClassPatch:Double =
  {
    val meanP = getMeanDeleteClassPatch.toDouble
    val meanB = getMeanSumClassPatch.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentAddMethodePatch:Double =
  {
    val meanP = getMeanAddMethodePatch.toDouble
    val meanB = getMeanSumMethodePatch.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentDeleteMethodePatch:Double =
  {
    val meanP = getMeanDeleteMethodePatch.toDouble
    val meanB = getMeanSumMethodePatch.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentModiMethodePatch:Double =
  {
    val meanP = getMeanModiMethodePatch.toDouble
    val meanB = getMeanSumMethodePatch.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentAddMethodeByClassPatch:Double =
  {
    val meanP = getMeanAddMethodeByClassPatch.toDouble
    val meanB = getMeanSumMethodePatch.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentDeleteMethodeByClassPatch:Double =
  {
    val meanP = getMeanDeleteMethodeByClassPatch.toDouble
    val meanB = getMeanSumMethodePatch.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentAddAllMethodePatch:Double =
  {
    val meanP = getMeanAllAddMethodePatch.toDouble
    val meanB = getMeanSumMethodePatch.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentDeleteAllMethodePatch:Double =
  {
    val meanP = getMeanAllDeleteMethodePatch.toDouble
    val meanB = getMeanSumMethodePatch.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

  def getPercentAllChangeNoClassPatch:Double =
  {
    val meanP = getMeanAllChangeNoClassMethodePatch.toDouble
    val meanB = getMeanSumMethodePatch.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return result
    }
    return 0
  }

  def getPercentAllChangePatch:Double =
  {
    val meanP = getMeanAllChangeMethodePatch.toDouble
    val meanB = getMeanSumMethodePatch.toDouble
    if(meanB !=0 && meanP !=0)
    {
      val result:Double = (meanP*100)/meanB
      return (result *1000).round / 1000.0
    }
    return 0
  }

}
