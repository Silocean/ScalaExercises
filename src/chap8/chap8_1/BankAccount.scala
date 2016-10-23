package chap8.chap8_1

/**
  * Created by Silocean on 2015-12-09.
  */
class BankAccount(initialBalance: Double) {
    private var balance = initialBalance

    def deposit(amount: Double) = {
        balance += amount;
        balance
    }

    def withdraw(amount: Double) = {
        balance -= amount
        balance
    }
}
