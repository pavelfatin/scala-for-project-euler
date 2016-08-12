val irrational = {
  def go(n: Int): Stream[Int] =
    n.toString.map(_.asDigit).toStream #::: go(n+1)
  go(0)
}

val r = (0 to 6).map(d => irrational(math.pow(10, d).toInt)).product

assert(r == 210)
