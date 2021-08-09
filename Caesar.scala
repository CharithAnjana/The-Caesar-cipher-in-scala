object Caesar extends App {

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val s = "CharithAnjana"

  val EN = (c:Char, key:Int, a:String) => a((a.indexOf(c.toUpper) + key) % a.size)

  val abs = (n:Int, a:String) => if(n >= 0) n else a.size + n

  val DE = (c:Char, key:Int, a:String) => a(abs(((a.indexOf(c.toUpper) - key) % a.size), a))

  val cipher = (algo:(Char, Int, String) => Char, s:String, key:Int, a:String) => s.map(algo(_, key, a))

  val ct = cipher(EN, s, 2, alphabet)
  val pt = cipher(DE, ct, 2, alphabet)

  println("Cipher Text : " + ct)
  println("Plain Text : " + pt)

}
