package chap_13

/**
  * Created by Silocean on 2015-12-17.
  */
object chap13_3 extends App {
    val list = List[Int](2, 5, 7, 0, 6, 4, 0)

    println(list.filter(_ != 0))
}
