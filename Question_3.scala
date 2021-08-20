class Account(x:Int){
    var balance = x;

    def Tranfer_Amount(Account_2:Account,amount:Int){
        this.balance = this.balance - amount 
        Account_2.balance = Account_2.balance + amount 
    } 
}

object Question_3 extends App{
    var Account1 = new Account(5000)
    var Account2 = new Account(3000)

    Account1.Tranfer_Amount(Account2,1000)
    println(Account1.balance)
    println(Account2.balance)

}