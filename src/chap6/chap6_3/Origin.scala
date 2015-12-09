package chap6.chap6_3

import java.awt.Point

/**
 * Created by Tracy on 2015-12-09.
 * 定义一个扩展自java.awt.Point的Origin对象。为什么说这实际上不是个好主意？(仔细看Point类的方法)  
 *
 * Point中的getLocation方法返回的是Point对象，如果想返回Origin对象，需要Origin类才行
 */
object Origin extends java.awt.Point with App {
    override def getLocation: Point = super.getLocation

    println(Origin.getLocation)

}
