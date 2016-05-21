def e(n: Int, i: Int): Long = {
  if (i == 1) n.toLong
  else (n * e(n, i-1)) % 10000000000L
}

val r = (1 to 1000).map(x => e(x, x)).sum % 10000000000L

assert(r == 9110846700L)
