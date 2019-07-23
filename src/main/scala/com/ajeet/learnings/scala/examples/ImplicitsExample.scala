package com.ajeet.learnings.scala.examples

object ImplicitsExample extends App {

  case class Point(source:String, x:Double, y:Double)

  implicit def toPoint(wkt:String):Point = {
    Point("WKT:" + wkt, 10.20, 30.30)
  }

  implicit def toPoint(wkb:Array[Byte]) = {
    Point("WKB:" + wkb.toString, 10.20, 30.30)
  }

  def render(implicit geom:Point) = {
    println("Geometry rendered from " + geom.source)
  }

  render("POINT(10 20)")
  render("POINT(10 20)".getBytes)
}
