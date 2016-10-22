package chap3

/**
 * Created by Tracy on 2015-12-08.
 * 计算Array[Double]的平均值
 */
object chap3_5 {
    def main(args: Array[String]) {
        val arr = Array[Double](3,5,1,9,4)
        println(arr.sum / arr.length)
    }
}
