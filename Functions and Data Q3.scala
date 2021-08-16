object Account extends App {

  val a1=new Account(500)
  val a2=new Account(200)

  a1.transfer(a2,100)

  println(a1)
  println(a2)
}

class Account (b:Double){
  var balance:Double=b
  override def toString="["+balance+"]"

  def transfer(b:Account,a:Double):Unit={
    this.balance=this.balance-a
    b.balance=b.balance+a
  }
}