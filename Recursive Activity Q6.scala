object fibonacci extends App{
  def fibonacci(n:Int):Int =n match{
    case 0 => 0
    case x if x==1 => 1
    case _ =>fibonacci(n-1)=fibonacci(n-2)
  }
}