package chap3

/**
  * Created by Silocean on 2015-12-07.
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
