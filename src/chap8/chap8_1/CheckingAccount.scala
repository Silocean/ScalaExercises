package chap8.chap8_1

/**
  * Created by Silocean on 2015-12-09.
  */
class CheckingAccount(initialBalance: Double, poundage: Double = 1) extends BankAccount(initialBalance) {
    override def deposit(amount: Double) = {
        super.deposit(amount - poundage)
    }

    override def withdraw(amount: Double) = {
        super.withdraw(amount + poundage)
    }
}
