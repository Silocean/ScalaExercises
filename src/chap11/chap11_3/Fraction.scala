package chap11.chap11_3

/**
  * Created by Silocean on 2015-12-11.
  */
class Fraction(n: Int, d: Int) {
    private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d)
    private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d)

    override def toString() = num + "/" + den

    def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0

    def gcd(a: Int, b: Int): Int = if (b == 0) scala.math.abs(a) else gcd(b, a % b)

    def +(that: Fraction): Fraction = {
        new Fraction(num * that.den + that.num * den, den * that.den)
    }

    def -(that: Fraction): Fraction = {
        new Fraction(num * that.den - that.num * den, den * that.den)
    }

    def *(that: Fraction): Fraction = {
        new Fraction(num * that.num, den * that.den)
    }

    def /(that: Fraction): Fraction = {
        new Fraction(num * that.den, den * that.num)
    }
}
