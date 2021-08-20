class Account(a:String,x:Int){
    var accountNumber = a
    var balance = x
     def +(a: Account) =new Account(accountNumber, this.balance+a.balance)
     def interest:Double = if(balance>0)this.balance*105/100 else this.balance*110/100  
     override def toString: String = s"$balance"
 
}

object Question_4 extends App{
    
        var bank:List[Account] = List(new Account("1222",1000),new Account("1223",-1000),new Account("1224",1000),new Account("1225",1000))
        val negBalance_Account=(b:List[Account])=>println(b.filter(x=>x.balance<0))
        val Balance_Account=(b:List[Account])=> b.reduce((x,y)=>x+y)
        
        println("List of Accounts with negative balances")
        println(negBalance_Account(bank))

        println("Calculate the sum of all account balances")
        println(Balance_Account(bank))

        println("Calculate the final balances of all accounts after apply the interest function as fallows: ")
        val finalBalance = (b:List[Account]) => b.map(_.interest)
        println("Account Balance   : " +finalBalance(bank))


}