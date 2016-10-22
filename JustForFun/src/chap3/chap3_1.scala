package chap3

/**
  * Created by Silocean on 2015-12-07.
  * 编写一段代码，将a设置为一个n个随机整数的数组，要求随机数介于0（包含）和n（不包含）之间。
  */
import scala.util.Random._
object chap3_1 {
    def main(args: Array[String]): Unit = {
        produceRandomNum(10)
    }
    def produceRandomNum(n: Int) = {
        (for(i<-1 to 10) yield nextInt(10)).foreach(println _)
    }
}
