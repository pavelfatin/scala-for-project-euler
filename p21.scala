val ds = (0 until 10000).view
  .map(n => (1 to (n / 2)).filter(n % _ == 0).sum)

val as = ds.zipWithIndex.collect {
  case (n, i) if n < 10000 && ds(n) != n && ds(n) == i => i
}

val r = as.sum

assert(r == 31626) // 658 ms
