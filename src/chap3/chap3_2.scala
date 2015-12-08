package chap3

/**
 * Created by Tracy on 2015-12-08.
 * 编写一个循环，将整数数组中相邻的元素置换。例如，Array(1,2,3,4,5)经置换后变为Array(2,1,4,3,5）
 */
object chap3_2 {
    def main(args: Array[String]) {
        val a = Array(1, 2, 3, 4, 5)
        val result = Array(1, 2, 3, 4, 5)
        for (x <- 0 until a.length if (x % 2 == 1)) {
            result(x) = a(x - 1)
            result(x - 1) = a(x)
        }
        for (x <- result) println(x)
    }
}
