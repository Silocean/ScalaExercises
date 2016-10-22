package chap9.chap9_7

import scala.io.Source

/**
 * 正则表达式还要在复习复习啊~~~~
 * Created by Tracy on 2015-12-10.
 */
object chap9_7 extends App {
    val source = Source.fromFile("./src/chap9/chap9_7/source.txt").mkString
    val pattern = """[^((\d+\.){0,1}\d+)^\s+]+""".r
    pattern.findAllIn(source).foreach(println _)
}
