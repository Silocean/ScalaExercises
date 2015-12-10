package chap9.chap9_6

import scala.io.Source

/**
  * Created by Silocean on 2015-12-09.
  */
object chap9_6 extends App {
    val source = Source.fromFile("./src/chap9/chap9_6/source.txt").mkString
    val pattern = """\w+\s""".r
    pattern.findAllIn(source).foreach(println _)
}
