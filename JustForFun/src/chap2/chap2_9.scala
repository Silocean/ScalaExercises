package chap2

/**
  * Created by Silocean on 2015-12-07.
  */
object chap2_9 {
    def main(args: Array[String]): Unit = {
        println(product("Hello"))
    }

    def product(s: String): Long = {
        if (s.length == 1) return s.charAt(0).toLong
        else s.charAt(0).toLong * product(s.drop(1))
    }

}
