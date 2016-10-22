package chap4

/**
 * Created by Tracy on 2015-12-08.
 * 打印出所有Java系统属性的表格。
 */

import scala.collection.JavaConversions.propertiesAsScalaMap
import scala.collection.Map

object chap4_7 {
    def main(args: Array[String]) {
        val props: Map[String, String] = System.getProperties
        val keys = props.keySet
        val lengths = for (key <- keys) yield key.length
        val maxLength = lengths.max
        for ((k, v) <- props) {
            print(k)
            print(" " * (maxLength - k.length))
            print("|")
            println(props(k))
        }
    }
}
