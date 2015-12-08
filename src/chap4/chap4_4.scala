package chap4

import scala.collection.SortedMap
import scala.io.Source

/**
 * Created by Tracy on 2015-12-08.
 */
object chap4_4 {
    def main(args: Array[String]) {
        val source = Source.fromFile("./src/chap4/words.txt").mkString
        val tokens = source.split("\\s+")
        var map = SortedMap[String, Int]()
        for(key <- tokens) {
            map += (key -> (map.getOrElse(key,0) + 1))
        }
        println(map.mkString(","))
    }
}
