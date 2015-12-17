package chap_13

import scala.collection.mutable

/**
  * Created by Silocean on 2015-12-17.
  */
object chap13_1 extends App {
    val map = new mutable.HashMap[Char, mutable.SortedSet[Int]]()

    def indexes(str: String) = {
        var i = 0
        str.foreach {
            c => map.get(c) match {
                case Some(result) => map(c) = result + i
                case None => map += (c -> mutable.SortedSet {
                    i
                })
            }
                i += 1
        }
        map
    }

    println(indexes("Mississippi"))
}
