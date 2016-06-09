package chap11.chap11_10

/**
  * Created by Silocean on 2016-06-09.
  */
object Test extends App {
    val path = "/home/cay/readme.txt"
    path match {
        case RichFile(root, home, cay, readme) => println(home + ";" + cay + ";" + readme)
        case _ => println("None")
    }
}
