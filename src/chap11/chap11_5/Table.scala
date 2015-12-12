package chap11.chap11_5

/**
  * Created by Silocean on 2015-12-11.
  */
class Table {
    var s: String = ""

    def |(str: String): Table = {
        val t = Table()
        t.s = this.s + "<td>" + str + "</td>"
        t
    }

    def ||(str: String): Table = {
        val t = Table()
        t.s = this.s + "</tr><tr><td>" + str + "</td>"
        t
    }

    override def toString() = {
        "<table><tr>" + this.s + "</tr></table>"
    }

}

object Table {
    def apply(): Table = {
        new Table()
    }
}

