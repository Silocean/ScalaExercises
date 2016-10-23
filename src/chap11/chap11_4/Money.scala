package chap11.chap11_4

/**
  * Created by Silocean on 2015-12-11.
  */
class Money(val dollor: Int, val cent: Int) {

    def +(that: Money): Money = {
        new Money(dollor + that.dollor + ((cent + that.cent) / 100), (cent + that.cent) % 100)
    }

    def -(that: Money): Money = {
        new Money((toCent(this) - toCent(that)) / 100, (toCent(this) - toCent(that)) % 100)
    }

    def ==(that: Money): Boolean = {
        dollor == that.dollor && cent == that.cent
    }

    def <(that: Money): Boolean = {
        dollor < that.dollor || (dollor == that.dollor && cent < that.cent)
    }

    private def toCent(money: Money): Int = {
        money.dollor * 100 + money.cent
    }

    override def toString() = dollor + "," + cent
}
