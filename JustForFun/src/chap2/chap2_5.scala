package chap2

/**
  * Created by Silocean on 2015-12-07.
  */
object chap2_5 {
    def main(args: Array[String]) {
        countdown(4)
    }

    def countdown(n: Int): Unit = {
        for (i <- 0 to n reverse) println(i)
    }

}
