package chap8.chap8_8

/**
  * Created by Silocean on 2015-12-09.
  */
class SecretAgent(codeName: String) extends Person(codeName) {
    override val name = "secret"
    override val toString = "secret"
}