package chap4

/**
 * Created by Tracy on 2015-12-08.
 * 设置一个映射，其中包含你想要的一些装备，以及它们的价格。然后构建另一个映射，采用同一组键，但在价格上打9折。
 */
object chap4_1 {
    def main(args: Array[String]) {
        val map = Map("apple" -> 3.5, "phone" -> 1500.0, "book" -> 65.0)
        val result = for ((k, v) <- map) yield (k, v * 0.9)
        println(result.mkString(","))
    }
}
