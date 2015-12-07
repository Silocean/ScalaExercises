package chap2

/**
  * Created by Silocean on 2015-12-07.
  */
object chap2_10 {
    def main(args: Array[String]) {
        println(calculateX(4, 3))
    }

    def calculateX(x: Int, n: Int): Int = {
        if (n == 0) 1
        else if (n > 0 && n % 2 == 0) calculateX(x, n / 2) * calculateX(x, n / 2)
        else if (n > 0 && n % 2 == 1) x * calculateX(x, n - 1)
        else 1 / calculateX(x, -n)
    }
}
