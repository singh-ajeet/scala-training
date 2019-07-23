package com.ajeet.learnings.scala.examples

object PatternMatching extends App {

  def printAny(input: Any) = {
    input match {
      case input:String => println("This is a string -> " + input)
      case input:Number => println("This is an numerical value -> " + input)
      case _ => println("I am not aware about its type.")
    }
  }

  case class Input(x:Int, y:Int)

  def extractAttribute(input:Input) = {
    input match {
      case Input(_, 100) => println("y is always 100")
      case Input(100, _) => println("x is always 100")
      case _ => println("Rest of all inputs")
    }
  }

  printAny("Hello")
  printAny(100)
  printAny(100.20)
  printAny(true)


  extractAttribute(Input(100, 100))
  extractAttribute(Input(100, 200))
  extractAttribute(Input(200, 300))
}
