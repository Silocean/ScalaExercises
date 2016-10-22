package chap6.chap6_4

/**
 * Created by Tracy on 2015-12-09.
 */
class Point(x: Int, y: Int) {
    override def toString() = x + "," + y
}

object Point extends App {
    def apply(x: Int, y: Int) = {
        new Point(x, y)
    }

    val p = Point(3, 4)
    val p2 = new Point(2, 4)
    println(p)
    println(p2)
}

