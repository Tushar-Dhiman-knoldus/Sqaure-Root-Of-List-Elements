package com.knoldus.listelementssquare

import scala.math.sqrt

class ListElementsSquare {

  // This function finds the square root of each element in the list using map.
  def squareRootOfEachElement(list: List[Int]): List[Int] = {
    list.map { element =>
      if (element < 0) throw new IllegalArgumentException("Number cannot be negative")
      else sqrt(element).toInt
    }
  }

  // This function finds the square root of each element in the list using tail recursion.
  def squareRootOfEachElementUsingRecursion(list: List[Int], accumulator: List[Int] = List()): List[Int] = {
    list match {
      case List() => accumulator
      case head :: tail => if (head < 0) throw new IllegalArgumentException("Number cannot be negative")
      else squareRootOfEachElementUsingRecursion(tail, accumulator :+ (sqrt(head).toInt))
    }
  }
}

