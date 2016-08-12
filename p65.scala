def cf(n: Int): Stream[Int] = 1 #:: (n * 2) #:: 1 #:: cf(n + 1)

val cs = cf(1).scanLeft((BigInt(2), BigInt(1)))((p, a) =>
  (a * p._1 + p._2, p._1)
).map(_._1)

val r = cs(99).toString.map(_.asDigit).sum

assert(r == 272)
