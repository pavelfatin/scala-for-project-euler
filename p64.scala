def cf(d: Int, m: Int, a: Int, n: Int): Stream[Int] = {
  val m1 = d * a - m
  val d1 = (n - m1 * m1) / d
  val a1 = (math.sqrt(n).toInt + m1) / d1
  a1 #:: cf(d1, m1, a1, n)
}

val r = (2 to 10000).count(n => {
  val m = math.sqrt(n).toInt
  m * m != n && cf(1, 0, m, n).indexOf(m * 2) % 2 == 0
})

assert(r == 1322)
