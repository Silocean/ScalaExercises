package chap3

/**
 * Created by Tracy on 2015-12-08.
 * 创建一个由java.util.TimeZone.getAvailableIds返回的时区集合，判断条件是它们在美洲。去掉"America/"前缀并排序
 */
object chap3_9 {
    def main(args: Array[String]) {
        val zones = java.util.TimeZone.getAvailableIDs()
        val result = for (x <- zones if (x.startsWith("America/"))) yield {
            x.drop("America/".length)
        }
        for (x <- result) println(x)
    }
}
