package chap12

/**
  * Created by Silocean on 2015-12-12.
  */
object chap12_6 extends App {
    def largest(fun: (Int) => Int, inputs: Seq[Int]) = {
        val m = inputs.reduceLeft((a, b) => if (fun(a) > fun(b)) a else b)
        m
    }

    println(largest(x => 10 * x - x * x, 1 to 10))
}
