package chap_13

/**
  * Created by Silocean on 2016-01-15.
  */
object chap13_6 extends App {
    val list = List(1, 2, 3, 4, 5)
    println((list :\ List[Int]()) (_ :: _)) // list.foldRight(List[Int]())(_ :: _)
    println((List[Int]() /: list) (_ :+ _)) // list.foldLeft(List[Int]())(_ :+ _)
    println((List[Int]() /: list.reverse) (_ :+ _))
    println((List[Int]() /: list) ((a, b) => (b :: a)))
}
