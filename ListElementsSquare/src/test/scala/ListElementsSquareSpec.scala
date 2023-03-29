package com.knoldus.listelementssquare

import org.scalatest.flatspec.AnyFlatSpec

class ListElementsSquareSpec extends AnyFlatSpec {

  val listElementsSquareObject = new ListElementsSquare()

  "squareEachElement" should "squareRootOfEachElement() should return a list containing all the square root of all the elements." in {

    val list: List[Int] = List(4, 16, 144, 169, 49)
    val expectedResult = List(2, 4, 12, 13, 7)
    assert(listElementsSquareObject.squareRootOfEachElement(list) == expectedResult)
  }
  "squareEachElement" should "throw an IllegalArgumentException when there present a negative number in the list" in {

    val list: List[Int] = List(4, 16, 144, -169, 49)
    assertThrows[IllegalArgumentException] {
      listElementsSquareObject.squareRootOfEachElement(list)
    }
  }
  "squareRootOfEachElementUsingRecursion" should "squareRootOfEachElementUsingRecursion() should return a list containing all the square root of all the elements." in {

    val list: List[Int] = List(4, 16, 144, 169, 49)
    val expectedResult = List(2, 4, 12, 13, 7)
    assert(listElementsSquareObject.squareRootOfEachElementUsingRecursion(list) == expectedResult)
  }
  "squareRootOfEachElementUsingRecursion" should "throw an IllegalArgumentException when there present a negative number in the list" in {

    val list: List[Int] = List(4, -16, 144, 169, 49)
    assertThrows[IllegalArgumentException] {
      listElementsSquareObject.squareRootOfEachElementUsingRecursion(list)
    }
  }
}
