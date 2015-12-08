/**
 * Created by Tracy on 2015-12-08.
 */
object Test {
    def main(args: Array[String]) {
        val a = Array(1, 2, 3, 4, 5)
        val b = dealWithArray(Array(1, 2, 3, 4, 5))
        println(b.mkString(","))
        println(a.mkString(","))
    }

    def dealWithArray(arr: Array[Int]) = {
        arr(0) = 9
        arr
    }
}
