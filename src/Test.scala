import java.util

/**
  * Created by Silocean on 2015-12-09.
  */
object Test extends App {
    /*
    val source = Source.fromURL("http://voice.hupu.com/nba/1981023.html", "utf-8")
    for (line <- source.getLines()) println(line)*/
    // val source = Source.stdin

    /*
    import java.io.File
    def subdir(dir:File): Iterator[File] = {
        val childen = dir.listFiles().filter(_.isDirectory)
        childen.toIterator ++ childen.toIterator.flatMap(subdir(_))
    }
    for(d <- subdir(new File("./src"))) println(d.getName)
    */

    /*
    val seq = Seq[(Double, Double)]((1, 2), (3, 4), (5, 6))

    def f(t1: Tuple2[Double, Double], t2: Tuple2[Double, Double]) = {
        (t1._1 + t2._1, t1._2 + t2._2)
    }
    println(seq.reduce((a, b) => f(a, b)))

    println(seq.reduce((p, q) => (p._1 + q._1, p._2 + q._2)))
    */

    val doc = <html><head>Scala Programming</head><body>...</body></html>
    val item = <li>Fred</li><li>John</li>

    new util.ArrayList[String]()


}
