def gcd(a: Int, b: Int): Int = if (a % b == 0) b else gcd(b, a % b)

val limit = 1000

val lengths = Array.fill(limit + 1)(0)

for (
  i <- 2 to math.sqrt(limit / 2).toInt;
  j <- 1 to i - 1 if (i + j) % 2 == 1 && gcd(i, j) == 1;
  k <- 2 * i * (i + j) to limit by 2 * i * (i + j)
) lengths(k) += 1

val r = lengths.indexOf(lengths.max)

assert(r == 840)
