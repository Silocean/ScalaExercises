package chap5

/**
 * Created by Tracy on 2015-12-08.
 * 编写一个Time类，加入只读属性hours和minutes，和一个检查某一时刻是否早于另一时刻的方法
 * before(other:Time):Boolean。Time对象应该以new Time(hrs,min)方式构建。
 * 其中hrs以军用时间格式呈现(介于0和23之间)
 */
object chap5_3 {
    def main(args: Array[String]) {

    }

    class Time(val hours: Int, val minutes: Int) {
        def before(other: Time): Boolean = {
            hours < other.hours || (hours == other.hours && minutes < other.minutes)
        }

        override def toString(): String = {
            hours + ":" + minutes
        }
    }


}
