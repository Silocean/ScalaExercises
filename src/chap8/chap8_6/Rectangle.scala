package chap8.chap8_6

/**
  * Created by Silocean on 2015-12-09.
  */
class Rectangle(startX: Int, startY: Int, endX: Int, endY: Int) extends Shape {
    override def centerPoint(): Point = {
        new Point((endX - startX) / 2, (endY - startY) / 2)
    }
}
