package chap6.chap6_5

/**
 * Created by Tracy on 2015-12-09.
 * 编写一个Scala应用程序,使用App特质,以反序打印命令行参数,用空格隔开。
 * 举例来说,scala Reverse Hello World应该打印World Hello
 */
object PrintArgs extends App{
    val result = for (x <- args reverse) yield x
    println(result.mkString(" "))
}

