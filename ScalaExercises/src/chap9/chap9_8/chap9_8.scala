package chap9.chap9_8

import scala.io.Source

/**
 * Created by Tracy on 2015-12-10.
 */
object chap9_8 extends App {
    val source = Source.fromURL("http://voice.hupu.com/nba/1981023.html", "utf-8").mkString
    val pattern = """<img[^>]+(src\s*=\s*"[^>^"]+")[^>]*>""".r
    for (pattern(src) <- pattern.findAllIn(source)) println(src)
    // println(line)
}
