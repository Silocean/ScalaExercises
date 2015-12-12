package chap12

/**
  * Created by Silocean on 2015-12-12.
  */
object chap12_2 extends App {
    val arr = Array(2, 5, 3, 6, 8)
    println(arr.reduceLeft(_ max _))
    println(arr.reduceLeft((a, b) => if (a > b) a else b))
}
