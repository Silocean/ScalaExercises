package chap8.chap8_7

/**
  * Created by Silocean on 2015-12-09.
  */
class Square(x: Int, y: Int, width: Int, height: Int) extends java.awt.Rectangle {
    def this(width: Int, height: Int) {
        this(0, 0, width, height)
    }

    def this() {
        this(0, 0, 0, 0)
    }

    override def toString() = x + "," + y + "," + width + "," + height
}
