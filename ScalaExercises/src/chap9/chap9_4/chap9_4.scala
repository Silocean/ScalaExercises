package chap9.chap9_4

import scala.io.Source

/**
  * Created by Silocean on 2015-12-09.
  * 从包含浮点数的文本文件读取内容，打印出文件中所有浮点数之和、平均值、最大值和最小值
  */
object chap9_4 extends App {
    val source = Source.fromFile("./src/chap9/chap9_4/source.txt")
    val tokens = source.mkString.split( """\s+""")
    val numbers = for (token <- tokens) yield token.toDouble
    println(numbers.sum)
    println(numbers.max)
    println(numbers.min)
    var total: Double = 0d
    numbers.foreach(total += _.toDouble)
    println(total / numbers.length)
}
