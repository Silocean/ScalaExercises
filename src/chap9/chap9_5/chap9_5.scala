package chap9.chap9_5

import java.io.PrintWriter

/**
  * Created by Silocean on 2015-12-09.
  */
object chap9_5 extends App {
    val out = new PrintWriter("./src/chap9/chap9_5/out.txt")
    for (i <- 0 to 20) {
        out.println(math.pow(2, i) + "\t" + (1 / math.pow(2, i)).toDouble)
    }
    out.close()
}
