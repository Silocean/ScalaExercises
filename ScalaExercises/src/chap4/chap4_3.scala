package chap4

/**
 * Created by Tracy on 2015-12-08.
 */

import scala.io.Source

object chap4_3 {
    def main(args: Array[String]) {
        val source = Source.fromFile("./src/chap4/words.txt").mkString
        val tokens = source.split("\\s+")
        var map: Map[String, Int] = Map()
        for (key <- tokens) {
            map += (key -> (map.getOrElse(key, 0) + 1))
        }
        println(map.mkString(","))
    }
}
