package chap8.chap8_2

/**
  * Created by Silocean on 2015-12-09.
  */
class SavingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
    private var index = 3

    override def deposit(amount: Double) = {
        if (index > 0) {
            index -= 1
            super.deposit(amount)
        } else {
            super.deposit(amount - 1)
        }
    }

    override def withdraw(amount: Double) = {
        if (index > 0) {
            index -= 1
            super.withdraw(amount)
        } else {
            super.withdraw(amount - 1)
        }
    }

    def earnMonthlyInterest(): Unit = {
        index = 3
    }
}
