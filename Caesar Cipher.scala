object Caesar {
  private val alphaU='A' to 'Z'
  private val alphaL='a' to 'z'

  def encode(text:String, key:Int)=text.map{
    case c if alphaU.contains(c) => rot(alphaU, c, key)
    case c if alphaL.contains(c) => rot(alphaL, c, key)
    case c => c
  }
  def decode(text:String, key:Int)=encode(text,-key)
  private def rot(a:IndexedSeq[Char], c:Char, key:Int)=a((c-a.head+key+a.size)%a.size)
}
val text="The five boxing wizards jump quickly"
println("Plaintext  => " + text)
val encoded=Caesar.encode(text, 3)
println("Ciphertext => " + encoded)
println("Decrypted  => " + Caesar.decode(encoded, 3))
