def isPentagonal(n: Int) = {
  val x = ((1 + math.sqrt(1 + 24L * n)) / 6)
  x == x.toInt
}

val r = Stream.from(144).map(n => n * (2 * n - 1))
  .find(isPentagonal).get

assert(r == 1533776805)
