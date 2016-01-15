package chap_14

/**
  * Created by Silocean on 2016-01-15.
  */
object chap14_2 extends App {
    val tup = Tuple2[Int, Int](1, 2)
    val swap = tup match {
        case (a, b) => (b, a)
        case _ => None
    }
    println(swap)

}
