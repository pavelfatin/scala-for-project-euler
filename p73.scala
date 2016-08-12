def fs(a: Int, b: Int, c: Int, d: Int, acc: Int): Int = {
  if (2 * c < 1 * d) {
    val k = (12000 + b) / d
    fs(c, d, k * c - a, k * d - b, acc + 1)
  }
  else acc
}

def adj(n: Int, d: Int): Stream[(Int, Int)]
  = (n, d) #:: adj(n + 1, d + 3)

val (n, d) = adj(1, 2).takeWhile(_._2 < 12000).last

val r = fs(1, 3, n, d, 0)

assert(r == 7295372)
