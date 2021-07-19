object sum extends App{
  def sum(n:Int):Int=if(n==1)1 else n+sum(n-1)
}