package chap9.chap9_1

import scala.io.Source

/**
  * Created by Silocean on 2015-12-09.
  * 倒序显示文件内容
  */
object chap9_1 extends App {
    val source = Source.fromFile("./src/chap9/chap9_1/chap9_1.scala")
    for (line <- source.getLines().toArray reverse) println(line)
}
