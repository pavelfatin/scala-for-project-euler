def isPentagonal(n: Int) = {
  val x = ((1 + math.sqrt(1 + 24L * n)) / 6)
  x == x.toInt
}

val ps = Stream.from(1).map(n => n * (3 * n - 1) / 2)

val rs = for (
  n <- ps;
  m <- ps.takeWhile(_ < n)
  if isPentagonal(n - m) && isPentagonal(n + m)
) yield n - m

val r = rs.head

assert(r == 5482660)
