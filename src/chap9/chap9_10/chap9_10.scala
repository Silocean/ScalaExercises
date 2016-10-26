package chap9.chap9_10

import java.io.{FileInputStream, ObjectInputStream, FileOutputStream, ObjectOutputStream}

/**
 * Created by Tracy on 2015-12-10.
 */
object chap9_10 extends App {
    val p1 = new Person("name")
    val p2 = new Person("Tracy")
    val p3 = new Person("John")
    p1.addFriend(p2)
    p1.addFriend(p3)
    // println(p1)

    val out = new ObjectOutputStream(new FileOutputStream("./src/chap9/chap9_10/result.obj"))
    out.writeObject(p1)
    out.close()

    val in = new ObjectInputStream(new FileInputStream("./src/chap9/chap9_10/result.obj"))
    val person = in.readObject().asInstanceOf[Person]
    in.close()
    println(person)
}
