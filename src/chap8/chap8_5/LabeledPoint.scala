package chap8.chap8_5

/**
  * Created by Silocean on 2015-12-09.
  */
class LabeledPoint(label: String, x: Int, y: Int) extends Point(x, y) {
    override def toString() = label + ":" + x + "," + y
}
