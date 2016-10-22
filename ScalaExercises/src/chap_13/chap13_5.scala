package chap_13

/**
  * Created by Silocean on 2015-12-17.
  */
object chap13_5 extends App {
    var tag = ","

    def mkString(list: List[String], t: String) = {
        tag = t
        list.reduceLeft((a, b) => addString(a, b))
        // list.reduceLeft((_, _) => addString(_, _)) // Error:missing parameter type for expanded function...
    }

    def addString(s1: String, s2: String) = {
        s1 + tag + s2
    }

    println(mkString(List("1", "2", "4"), ";"))
}
