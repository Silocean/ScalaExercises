package chap8.chap8_4

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Silocean on 2015-12-09.
  */
class Bundle extends Item {
    val items = new ArrayBuffer[Item]()

    def addItem(item: Item): Unit = {
        items.+=(item)
    }

    def price: Double = {
        var total: Double = 0d
        items.foreach(total += _.price)
        total
    }

    def description: String = {
        items.mkString("||")
    }

}
