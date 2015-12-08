package chap5

/**
 * Created by Tracy on 2015-12-08.
 */
object chap5_10 {
    def main(args: Array[String]) {
        val employ = new Employ()
        val employ2 = new Employ2("John Q. Public", 32.0)
    }

    class Employ {
        val name: String = "John Q. Public"
        val salary: Double = 0.0
    }

    class Employ2(val name: String, val salary: Double) {
        def this() {
            this("John Q. Public", 0.0)
        }
    }

}
