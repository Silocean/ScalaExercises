/**
 * Created by Tracy on 2015-12-08.
 */
object Test {
    def main(args: Array[String]) {
        val map = Map("apple" -> 3.5, "phone" -> 1500.0, "book" -> 65.0)
        for ((k, v) <- map) {
            println(map(k) + 34)
        }
    }


}
