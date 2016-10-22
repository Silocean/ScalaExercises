package chap2

/**
  * Created by Silocean on 2015-12-07.
  */
object chap2_6 {
    def main(args: Array[String]) {
        var sum = 1L
        for (c <- "Hello") sum *= c.toLong
        println(sum)
    }
}
