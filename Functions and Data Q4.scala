object BankAccount extends App{
  var bank:List[Account]=List()

  val a1=new Account(500)
  val a2=new Account(300)
  val a3=new Account(-200)
  val a4=new Account(-100)

  //Answer-Q4.1
  val neg=(bank:List[Account])=>bank.filter((x)=>(x.balance<0))

  //Answer-Q4.2
  val firstbalance=(bank:List[Account])=>bank.reduce((x,y)=>x+y)

  //Answer-Q4.3


  val l1=bank.filter((b)=>(b.balance<0))
  val l2=l1.map(x=>(x+(x*0.05)))
  val l3=bank.filter((b)=>(b.balance>0))
  val l4=l1.map(x=>(x-(x*0.1)))

  val l5=List.concat(l2,l3)
  val finalbalance=(l4:List[Account])=>l4.reduce((x,y)=>x+y)

  //Output

  println(neg)
  println(firstbalance)
  println(finalbalance)
}



class Account(b:Double){
  var balance:Double=b


  def +(a:Account)=new Account(this.balance+a.balance)
  def -(a:Account)=new Account(this.balance-a.balance)
  def <(a:Account)={if (this.balance<0) true else (false)}
  def >(a:Account)={if (this.balance>0) true else (false) }
  def *(d:Double):Account=new Account(this.balance*d)

  override def toString=""+balance+""

}

