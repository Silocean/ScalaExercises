package chap8.chap8_8

/**
  * Created by Silocean on 2015-12-09.
  */
class Person(val name: String) {
    override def toString = getClass.getName + "[name=" + name + "]"
}