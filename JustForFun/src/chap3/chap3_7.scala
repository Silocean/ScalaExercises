package chap3

/**
 * Created by Tracy on 2015-12-08.
 * 编写一段代码，产出数组中的所有值，去掉重复项。
 */
object chap3_7 {
    def main(args: Array[String]): Unit = {
        val arr = Array(3, 5, 2, 3, 6, 7, 4, 4, 4, 2, 7)
        println(arr.distinct.mkString(","))
    }
}
