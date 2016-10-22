package chap4

import java.io.File
import java.util.Scanner

/**
 * Created by Tracy on 2015-12-08.
 */

import scala.collection.mutable.Map

object chap4_2 {
    def main(args: Array[String]): Unit = {
        val in = new Scanner(new File("./src/chap4/words.txt"))
        val map: Map[String, Int] = Map()
        while (in.hasNext) {
            val word = in.next()
            if (map.contains(word)) {
                map(word) += 1
            } else {
                map += (word -> 1)
            }
        }
        println(map.mkString(","))
    }
}
