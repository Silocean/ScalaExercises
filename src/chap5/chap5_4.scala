package chap5

/**
 * Created by Tracy on 2015-12-08.
 * 重新实现前一个类中的Time类，将内部呈现改成午夜起的分钟数(介于0到24*60-1之间)。不要改变公有接口。
 * 也就是说，客户端代码不应因你的修改而受影响
 */
object chap5_4 {
    def main(args: Array[String]) {

    }

    class Time(val hours: Int, val minutes: Int) {
        def before(other: Time): Boolean = {
            hours < other.hours || (hours == other.hours && minutes < other.minutes)
        }

        override def toString(): String = {
            hours * 60 + minutes + ""
        }
    }

}
