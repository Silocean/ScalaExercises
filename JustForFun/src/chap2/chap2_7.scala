package chap2

/**
  * Created by Silocean on 2015-12-07.
  */
object chap2_7 {
    def main(args: Array[String]) {
        var sum = 1L
        "Hello".foreach(sum *= _.toLong)
        println(sum)
    }
}
