package chap2

/**
  * Created by Silocean on 2015-12-07.
  */
object chap2_8 {
    def main(args: Array[String]) {
        println(product("Hello"))
    }

    def product(s: String): Long = {
        var sum = 1L
        s.foreach(sum *= _.toLong)
        sum
    }
}
