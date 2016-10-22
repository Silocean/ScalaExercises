package chap4

import java.util.Calendar

import scala.collection.mutable

/**
 * Created by Tracy on 2015-12-08.
 */

object chap4_6 {
    def main(args: Array[String]) {
        val map = mutable.LinkedHashMap[String, Int]()
        map += ("Monday" -> Calendar.MONDAY)
        map += ("Tuesday" -> Calendar.TUESDAY)
        map += ("Wednesday" -> Calendar.WEDNESDAY)
        map += ("Thursday" -> Calendar.THURSDAY)
        map += ("Friday" -> Calendar.FRIDAY)
        map += ("Saturday" -> Calendar.SATURDAY)
        map += ("Sunday" -> Calendar.SUNDAY)
        print(map.mkString(","))
    }
}
