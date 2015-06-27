val as = (0 to 28123).map(n => (1 to (n / 2)).filter(n % _ == 0).sum)
  .zipWithIndex.filter(p => p._1 > p._2).map(_._2)

val exc = as.view.flatMap { a =>
  as.takeWhile(_ <= (28123 - a)).map(_ + a)
}

val r = (1 to 28123 diff exc).sum

assert(r == 4179871) // 5 s
