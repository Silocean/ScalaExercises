package chap_14

/**
  * Created by Silocean on 2016-01-15.
  */
object chap14_3 extends App {
    val arr = Array[Int](1, 2, 3, 4, 5)
    val swap = arr match {
        case Array(a, b, other@_*) => Array[Int](b, a) ++ other
        case _ => arr
    }
    println(swap.mkString(","))
}
