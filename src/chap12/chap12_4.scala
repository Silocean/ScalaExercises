package chap12

/**
  * Created by Silocean on 2015-12-12.
  */
object chap12_4 extends App {
    println((1 to -10).foldLeft(1)(_ * _))
}
