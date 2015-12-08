package chap5

/**
 * Created by Tracy on 2015-12-08.
 */
object chap5_1 {
    def main(args: Array[String]): Unit = {

    }

    class Counter {
        private var value = 0

        def increment() {
            if (value + 1 < Int.MaxValue)
                value += 1
            else
                value = 0
        }

        def current = value
    }

}
