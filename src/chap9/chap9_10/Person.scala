package chap9.chap9_10

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Tracy on 2015-12-10.
 */
class Person(var name: String) extends Serializable {
    private val friends = new ArrayBuffer[Person]()

    def addFriend(friend: Person): Unit = {
        friends += friend
    }

    override def toString() = {
        var str = "I am " + name + " and my friends are "
        friends.foreach(str += _.name + ",")
        str.substring(0, str.length - 2)
    }
}
