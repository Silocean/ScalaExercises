package chap8.chap8_6

/**
  * Created by Silocean on 2015-12-09.
  */
class Circle(x: Int, y: Int, radius: Int) extends Shape {
    override def centerPoint(): Point = {
        new Point(x, y)
    }
}
