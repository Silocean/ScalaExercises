package chap5

/**
 * Created by Tracy on 2015-12-08.
 * 创建一个Car类，以只读属性对应制造商，型号名称，型号年份以及一个可读写的属性用于车牌。
 * 提供四组构造器。每个构造器都要求制造商和型号为必填。型号年份和车牌可选，如果未填，
 * 则型号年份为-1，车牌为空串。你会选择哪一个作为你的主构造器？为什么？
 */
object chap5_8 {
    def main(args: Array[String]) {

    }

    class Car(val maker: String, val typeName: String, val year: Int = -1, var attribute: String = "") {

    }

}
