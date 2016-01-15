package chap_13

/**
  * Created by Silocean on 2016-01-15.
  */
object chap13_8 extends App {
    val arr = Array(1, 2, 3, 4, 5, 6)
    arr.grouped(3).toArray.foreach(a => println(a.mkString(",")))
}
