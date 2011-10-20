def ps(s: String): Seq[String] = if(s.size == 1) Seq(s) else 
  s.flatMap(c => ps(s.filterNot(_ == c)).map(c +))

val r = ps("0123456789")(999999).toLong

assert(r == 2783915460L) // 7 s