package chap6.chap6_7

/**
 * Created by Tracy on 2015-12-09.
 * 实现一个函数,检查某张牌的花色是否为红色
 */
object Poker extends Enumeration with App {
    val a = Value("♣")
    val b = Value("♠")
    val c = Value("♥")
    val d = Value("♦")

    def checkColor(c: Poker.Value): Unit = {
        if (c == Poker.b) println("♠") else print("is not red")
    }

    checkColor(b)

    checkColor(d)

}
