val as = (0 to 28123).map(n => (1 until n).filter(n % _ == 0).sum)
        .zipWithIndex.filter(p => p._1 > p._2).map(_._2)

val exc = as.view.flatMap { a => 
  as.takeWhile(_ <= (28123 - a)).map(a +)
} 

val r = (1 to 28123 diff exc).sum 

assert(r == 4179871) // 9 s