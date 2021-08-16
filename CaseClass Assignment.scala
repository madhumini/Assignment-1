object MyApp extends App{

  val p1=Point(2,3)
  val p2=Point(3,4)
  val p3=p1.move(4,3)
  val p4=p2.distance(p1)
  val p5=p1.invert()


  println(p1)
  println(p2)
  println(p3)
  println(p4)
  println(p5)
}

case class Point(a:Int,b:Int){
  def +(that:Point)=Point(this.a+that.a,this.b+that.b)
  def move(dx:Int,dy:Int)=Point(this.a+dx,this.b+dy)
  def distance(that:Point)=Point(this.a-that.a,this.b-that.b)
  def invert()=Point(this.b,this.a)
}
