val limit = Stream.from(1)
  .find(n => BigInt(9).pow(n).toString.size < n).get

val r = (1 until limit).map(n =>
  (1 to 9).count(d => BigInt(d).pow(n).toString.size == n)
).sum

assert(r == 49)
