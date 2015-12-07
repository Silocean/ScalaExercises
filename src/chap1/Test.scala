package chap1

/**
  * Created by Silocean on 2015-12-07.
  */

import java.math.BigInteger

import scala.math._

object Test {

    def main(args: Array[String]) {
        val result = BigInt(2).pow(1024)
        // print(result)
        println(BigInt.probablePrime(10, scala.util.Random))
        val str = "hello world"
        println(str.charAt(0))
        println(str.charAt(str.length - 1))
        println(str.take(2))
    }

}
