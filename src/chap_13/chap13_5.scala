package chap_13

/**
  * Created by Silocean on 2015-12-17.
  */
object chap13_5 extends App {
    def mkString(list: List[String]) = {
        list.reduceLeft(_ + _)
    }

    println(mkString(List("1", "2", "4")))
}
