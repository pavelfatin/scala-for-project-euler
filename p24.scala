def ps(s: String): Iterator[String] = if (s.length == 1) Iterator(s)
  else s.toIterator.flatMap(c => ps(s.filterNot(_ == c)).map(c + _))

val r = ps("0123456789").drop(999999).next().toLong

assert(r == 2783915460L) // 712 ms
