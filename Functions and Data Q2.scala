object myApp extends App {

  val x=new Rational(3,4)
  val y=new Rational(5,8)
  val z=new Rational(2,7)
  val a=x-y-z

  println(a)
}

  class Rational(n:Int,d:Int){
    def numer=n/gcd(Math.abs(n),d)
    def denom=d/gcd(Math.abs(n),d)
    override def toString=numer+"/"+denom

    private def gcd(a:Int,b:Int):Int=if(b==0)a else gcd(b,a%b)

    def -(r:Rational)=new Rational(this.numer*r.denom-this.denom*r.numer,
                                       this.denom*r.denom)



}
