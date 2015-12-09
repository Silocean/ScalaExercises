package chap5

/**
 * Created by Tracy on 2015-12-08.
 * 在5.2节的Person类中提供一个主构造器,将负年龄转换为0
 */
object chap5_6 {
    def main(args: Array[String]) {

    }

    class Person(var age: Int) {
        age = if (age < 0) 0 else age
    }

}
