package chap3

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Tracy on 2015-12-08.
 * 如何重新组织Aarray[Int]的元素将它们以反序排列？对于ArrayBuffer[Int]你又会怎么做？
 */
object chap3_6 {
    def main(args: Array[String]) {
        val arr = Array(4, 2, 1, 5, 7, 6)
        println(revertArray(arr).mkString(","))
        val buf = ArrayBuffer[Int](3,1,4,6,7,8)
        println(revertArrayBuffer(buf).mkString(","))
    }

    def revertArrayBuffer(a: ArrayBuffer[Int]): ArrayBuffer[Int] = {
        a.reverse
    }

    def revertArray(a: Array[Int]): Array[Int] = {
        for (x <- 0 to a.length / 2) {
            val temp = a(x)
            a(x) = a(a.length - 1 - x)
            a(a.length - 1 - x) = temp
        }
        a
    }
}
