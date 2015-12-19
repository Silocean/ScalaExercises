package chap_13

import scala.collection.immutable.HashMap
import scala.collection.mutable.ListBuffer


/**
  * Created by Silocean on 2015-12-17.
  */
object chap13_2 extends App {
    var map = new HashMap[Char, ListBuffer[Int]]()

    def indexes(str: String) = {
        var i = 0
        str.foreach {
            c => map.get(c) match {
                case Some(result) => result += i
                case None => map += (c -> ListBuffer {
                    i
                })
            }
                i += 1
        }
        map
    }

    println(indexes("Mississippi"))
}
