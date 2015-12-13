package chap12

/**
  * Created by Silocean on 2015-12-12.
  */
object chap12_1 extends App {
    var list = List[(Int, Int)]()

    def values(fun: (Int) => Int, low: Int, high: Int) = {
        for (n <- low to high) {
            list = (n, fun(n)) :: list
        }
        list
    }

    println(values(x => x * x, -5, 5).mkString(","))
}
