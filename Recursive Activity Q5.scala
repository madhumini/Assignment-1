object evensum extends App{
  def Evensum (n:Int):Int=n match
  case n if (n%2==1) => 0
  case n if (n==100) => 100
  case _  => n+Evensum(n+1)

}