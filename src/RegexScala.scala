/**
  * Created by Silocean on 2015-12-09.
  */
object RegexScala extends App {
    val itemsPattern = "([0-9]+) ([a-z]+)".r
    val itemsPattern(num, item) = "2 bles"
    for (itemsPattern(num, item) <- itemsPattern.findAllIn("99 bottles, 98 bottles"))
        println(num + " " + item)

}
