package chap9.chap9_2

import java.io.PrintWriter

import scala.io.Source

/**
  * Created by Silocean on 2015-12-09.
  * 读取文件内容，将Tab键替换成空格
  */
object chap9_2 extends App {
    val source = Source.fromFile("./src/chap9/chap9_2/source.txt")
    val out = new PrintWriter("./src/chap9/chap9_2/result.txt")
    for (line <- source.getLines().toArray) {
        out.println(line.replaceAll("\t", " "))
    }
    out.close()
}
