package chap9.chap9_3

import scala.io.Source

/**
  * Created by Silocean on 2015-12-09.
  * 读取文件中所有字符数大于2的单词，并打印到控制台
  */
object chap9_3 extends App {
    Source.fromFile("./src/chap9/chap9_3/source.txt").mkString.split( """\s+""")
        .foreach(arg => if (arg.length > 2) println(arg))
}
