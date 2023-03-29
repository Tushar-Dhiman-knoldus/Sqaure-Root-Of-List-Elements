package com.knoldus.listelementssquare

object ListElementsSquareDriver extends App {

  private val listElementsSquareObject = new ListElementsSquare()
  try {
    val result = listElementsSquareObject.squareRootOfEachElement(List(4, 9, 144, 16, 25))
    println(result)
  } catch {
    case e: IllegalArgumentException => println(e.getMessage)
  }

  try {
    val result2 = listElementsSquareObject.squareRootOfEachElementUsingRecursion(List(4, 9, -1, 16, 25))
    println(result2)
  } catch {
    case e: IllegalArgumentException => println(e.getMessage)
  }
}
