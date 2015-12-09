package chap6.chap6_6

/**
 * Created by Tracy on 2015-12-09.
 * 编写一个扑克牌4种花色的枚举,让其toString方法分别返回♣,♦,♥,♠
 */
object Poker extends Enumeration with App{
    val a = Value("♣")
    val b = Value("♠")
    val c = Value("♥")
    val d = Value("♦")
    println(Poker.a)
}
