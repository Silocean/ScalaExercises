package chap4

import scala.collection.JavaConversions.mapAsScalaMap
import scala.collection.mutable.Map
import scala.io.Source

/**
 * Created by Tracy on 2015-12-08.
 */
object chap4_5 {
    def main(args: Array[String]) {
        val source = Source.fromFile("./src/chap4/words.txt").mkString
        val tokens = source.split("\\s+")
        val map: Map[String, Int] = new java.util.TreeMap[String, Int]
        for (key <- tokens) {
            map(key) = map.getOrElse(key, 0) + 1
        }
        println(map.mkString(","))
    }
}
