package chap11.chap11_4

/**
  * Created by Silocean on 2015-12-11.
  */
object Test extends App {
    val m1 = new Money(1, 75)
    val m2 = new Money(0, 50)
    println(m1 + m2)
    println(m1 - m2)
    println(m1 < m2)
    println(m1 == m2)
}
