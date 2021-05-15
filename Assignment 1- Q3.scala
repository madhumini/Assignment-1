object main extends App{

  def bookprice(x:Int)=x*24.95
  def discount(x:Double)=x*.4
  def shippingCost(x:Int)=if(x<=50)3 else 3+(x-50)*.75
  println( "%f",(bookprice(60)+shippingCost(60)-discount(bookprice(60))))
}