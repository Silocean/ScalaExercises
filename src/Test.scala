
/**
  * Created by Silocean on 2015-12-09.
  */
object Test extends App {
    /*val source = Source.fromURL("http://voice.hupu.com/nba/1981023.html", "utf-8")
    for (line <- source.getLines()) println(line)*/
    // val source = Source.stdin
    import java.io.File
    def subdir(dir:File): Iterator[File] = {
        val childen = dir.listFiles().filter(_.isDirectory)
        childen.toIterator ++ childen.toIterator.flatMap(subdir(_))
    }
    for(d <- subdir(new File("./src"))) println(d.getName)
}
