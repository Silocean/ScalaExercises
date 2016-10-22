package chap2

/**
  * Created by Silocean on 2015-12-07.
  *
  */
object chap2_1 {
    def main(args: Array[String]) {
        val num = 4
        val signum = if (num > 0) 1 else if (num < 0) -1 else 0
        println(signum)
    }
}
