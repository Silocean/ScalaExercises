/**
  * Created by Silocean on 2016-03-02.
  */
object TestMap extends App {
    val feeds = Map("Andy Hunt" -> "blog.toolshed.com",
        "Dave Thomas" -> "pragdave.pragprog.com",
        "Dan Steinberg" -> "dimsumthinking.com/blog")
    val result = feeds filter { element =>
        val (key, value) = element
        (key startsWith "D") && (value contains "blog")
    }
    result.foreach(println)
    feeds.updated("dfad", "dfad")
}
