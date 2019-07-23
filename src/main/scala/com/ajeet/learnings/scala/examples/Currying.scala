package com.ajeet.learnings.scala.examples

import scala.collection.mutable

object Currying extends App {

  def filter(p: Int => Boolean)(list: List[Int]): List[Int] = {
    list.filter(p)
  }

  def filterGreaterThan100 = filter(x => x <= 100) _

  println(filterGreaterThan100(List(100,200,300)))
  println(filterGreaterThan100(List(1,2,3)))



  def printAll(strings: String*) {
    println(strings)
  }

  printAll("A", "B")
}
