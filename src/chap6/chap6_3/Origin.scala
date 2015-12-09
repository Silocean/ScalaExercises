package chap6.chap6_3

import java.awt.Point

/**
 * Created by Tracy on 2015-12-09.
 */
object Origin extends java.awt.Point with App {
    override def getLocation: Point = super.getLocation

    Origin.move(2, 6)

    println(Origin.toString)

}
