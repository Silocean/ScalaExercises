package chap_13

/**
  * Created by Silocean on 2016-01-15.
  */
object chap13_4 extends App {
    val arr = Array("Tom", "Fred", "Harry")
    val map = Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)

    def f(arr: Array[String], map: Map[String, Int]) = {
        arr.flatMap(map.get(_))
    }

    println(f(arr, map).mkString(","))

}
