object MyApp extends App {
  val r1=new Rational(2,3)
  println(r1)
  println(r1.neg)
}

class Rational(n:Int,d:Int){
  def numer=n/gcd(Math.abs(n),d)
  def denom=d/gcd(Math.abs(n),d)
  override def toString=numer+"/"+denom

  private def gcd(a:Int,b:Int):Int=if(b==0)a else gcd(b,a%b)

  def neg=new Rational(-this.numer,this.denom)

}
