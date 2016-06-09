package chap11.chap11_10

/**
  * Created by Silocean on 2016-06-09.
  */
object RichFile {
    def unapplySeq(input: String): Option[Seq[String]] = {
        if (input.trim == "") None
        else Some(input.split("/"))
    }
}
