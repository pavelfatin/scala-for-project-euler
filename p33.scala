val rs = for(i <- 1 to 9; j <- (i + 1) to 9; k <- 1 to 9; 
  if k * (9 * i + j) == 10 * i * j) yield (10 * i + j, 10 * j + k)

val p = rs.reduceLeft((n, d) => (n._1 * d._1, n._2 * d._2))

def gcd(n: Int, d: Int): Int = if (d == 0) n else gcd(d, n % d)

val r = p._2 / gcd(p._1, p._2)

assert(r == 100) // 5 ms