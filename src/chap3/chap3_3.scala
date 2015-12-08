package chap3

/**
 * Created by Tracy on 2015-12-08.
 * 重复第二题的联系，不过这一次生成一个新的值交换过的数组。用for/yield
 */
object chap3_3 {
    def main(args: Array[String]) {
        val a = Array(1, 2, 3, 4, 5)
        val result = Array(1, 2, 3, 4, 5)
        val b = for (x <- 0 until a.length) yield {
            if (x % 2 == 1) {
                result(x) = a(x - 1)
                result(x - 1) = a(x)
            }
            result(x)
        }
        val c = result
        println(result.mkString(","))
        println(a.mkString(","))
        // 为什么b的结果是这样的？？？(1,1,3,3,5)
        println(b.mkString(","))
        println(c.mkString(","))
    }


}
