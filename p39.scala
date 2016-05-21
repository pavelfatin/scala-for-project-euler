def solve(n: Int) = {
  val solutions = for {
    i <- (1 to n / 3); j <- (i * 2 to n * 2 / 3)
    if (n - j) * (n - j) == (j - i) * (j - i) + i * i
  } yield (i, j - i, n - j)

  (n, solutions.size)
}

val r = (1 to 1000).map(solve).maxBy(_._2)._1

assert(r == 840)
