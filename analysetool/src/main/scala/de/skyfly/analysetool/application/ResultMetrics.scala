package de.skyfly.analysetool.application

class ResultMetrics (

  val previousJar: String = "",
  val currentJar: String = "",

  val deleteClass: Int,

  val addClass: Int,

  val addMethode: Int,

  val deleteMethode: Int,

  val modiMethode: Int,

  val previousClassCount: Int,

  val previousMethodeCount: Int,

  val currentClassCount: Int,

  val currentMethodeCount:Int,

  val patchLevel:Int,

  val deleteMethodeByClass: Int,

  val addMethodeByClass: Int,
                    )
