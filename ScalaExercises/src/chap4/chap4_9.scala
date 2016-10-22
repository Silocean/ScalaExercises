package chap4

/**
 * Created by Tracy on 2015-12-08.
 * 编写一个函数Iteqgt(values:Array[int],v:Int),返回数组中小于v,等于v和大于v的数量，要求三个值一起返回。
 */
object chap4_9 {
    def main(args: Array[String]) {
        println(Iteqgt(Array(3, 4, 7, 6), 4))
    }

    def Iteqgt(values: Array[Int], v: Int) = {
        (values.count(_ < v), values.count(_ == v), values.count(_ > v))
    }

}
