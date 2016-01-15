package chap_13

/**
  * Created by Silocean on 2016-01-15.
  */
object chap13_7 extends App {
    val prices = List(5.0, 20.0, 9.95)
    val quantities = List(10, 2, 1)
    println((prices zip quantities) map (p => p._1 * p._2))
    println((prices zip quantities).map(Function.tupled(_ * _)))
}
