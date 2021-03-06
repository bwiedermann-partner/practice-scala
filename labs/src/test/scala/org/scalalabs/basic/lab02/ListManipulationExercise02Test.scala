package org.scalalabs.basic.lab02

import org.scalatest.junit.JUnitSuite
import org.junit.Test
import java.lang.{ IllegalArgumentException => IAE }
import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import ListManipulationExercise02._

/**
 * Lab 02: more Scala collection operations
 * 
 * Scala advanced Lists
 *
 * Your job is to implement the objects and classes in
 * such a way that the tests in this suite all succeed.
 *
  * One exercise consists of rewriting imperatively written code to a style that is more functional. 
 */

@RunWith(classOf[JUnitRunner])
class ListManipulationExercise02Test extends Specification {
  
 "A Scala List" should {
   "find max int in list" in {
    9 === maxElementInList(List(1, 9, 4, 9, 8))
    25 === maxElementInList(List(1, 7, 5, 17, 25, 24, 22, 19))
  }

   "calc sum of same positioned elements in two lists" in {
    List(2, 8, 14) === sumOfTwo(List(1, 5, 9), List(1, 3, 5))
    //if one of the lists is empty return the ones with values
    List(1, 2, 3) === sumOfTwo(List(1, 2, 3), List())
    List(1, 2, 3) === sumOfTwo(List(), List(1, 2, 3))
  }

   "calc sum of same positioned elements in many lists" in {
    List(12, 15, 18) === sumOfMany(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
  }
  
   "rewrite imperative to functional" in {
     //This unit test succeeds! But, the code that is called is written 'Java style',
    //it contains a lot of boilerplate code. Your job is to rewrite the code, get rid of the
    //loops and variables, and use only functions.
    val avery1 = Person(15, "Avery1", "Jansen")
    val avery2 = Person(17, "Avery2", "Janssen")
    val avery3 = Person(18, "Avery3", "Jansssen")
    val jordan1 = Person(17, "Jordan1", "Peterson")
    val jordan2 = Person(19, "Jordan2", "Petersson")
    val nehal = Person(21, "Nehal", "Tambe")
    
    val result = separateTheYoungFromTheOld(List(nehal, avery1, avery2, avery3, jordan1, jordan2))
    
    List(List("Avery1", "Avery2", "Jordan1"), List("Avery3", "Jordan2", "Nehal")) === result
  }
 }
}