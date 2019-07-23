package com.ajeet.learnings.scala.examples

object ExceptionHandling extends App {

  def throwException(input:String) = {
    if("illegal".equals(input)) throw new IllegalArgumentException("This is illegal")
    else if (input == null || "".equals(input)) throw new Exception("This is father of all")
    else if("runtime".equals(input)) throw new RuntimeException("This is runtime")
  }

  def handleException(input:String) = {
    try {
      throwException(input)
    } catch {
      case ex:IllegalArgumentException => println("This is not allowed => " + ex.getMessage)
      case ex:RuntimeException => println("Something went wrong at runtime => " + ex.getMessage)
      case ex : Exception => println("I dont know what is going on => " + ex.getMessage)
      //case _ : Exception => println("I dont know what is going on")
    } finally {
      println("Everything finally handled")
    }
  }

  handleException("runtime")
  handleException("illegal")
  handleException("")
  handleException(null)
}
