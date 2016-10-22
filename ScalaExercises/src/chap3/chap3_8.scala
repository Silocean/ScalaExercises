package chap3

/**
 * Created by Tracy on 2015-12-08.
 * 收集数组中负值元素的下标，反序，去掉最后一个下标，然后对每一个下标调用a.remove(i)。
 */
object chap3_8 {
    def main(args: Array[String]): Unit = {
        val a = Array(3, 4, -8, 2, -9, -3, 12, 5)
        val indexes = for (x <- 0 until a.length if (a(x) < 0)) yield x
        val tmp = a.toBuffer
        for (x <- indexes.reverse.dropRight(1)) {
            tmp.remove(x)
        }
        println(tmp.mkString(","))
    }
}
