package chap4

/**
 * Created by Tracy on 2015-12-08.
 */
object chap4_8 {
    def main(args: Array[String]) {
        println(minmax(Array(4,2,6,7)))
    }

    def minmax(values: Array[Int]) = {
        (values.max, values.min)
    }

}
