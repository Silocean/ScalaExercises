package chap8.chap8_4

/**
  * Created by Silocean on 2015-12-09.
  */
abstract class Item {
    def price: Double

    def description: String
    override def toString() = price + "," + description
}
