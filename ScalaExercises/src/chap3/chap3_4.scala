package chap3

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Tracy on 2015-12-08.
 * 给定一个整数数组，产出一个新的数组，包含原数组中的所有正值，以原有顺序排列，之后的元素是所有零或负值，以原有顺序排列
 */
object chap3_4 {
    def main(args: Array[String]) {
        val a = Array(4, 2, 5, -6, 9, 0, -3, 8)
        println(dealWithArray(a).mkString(","))
    }

    def dealWithArray(arr: Array[Int]): Array[Int] = {
        val buf = new ArrayBuffer[Int]()
        buf ++= (for (x <- arr if (x > 0)) yield x)
        buf ++= (for (x <- arr if (x <= 0)) yield x)
        buf.toArray
    }
}
