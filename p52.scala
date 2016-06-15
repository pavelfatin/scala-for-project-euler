val r = Stream.from(1).find(n =>
  (1 to 6).forall(m => (n * m).toString.sorted == n.toString.sorted)
).get

assert(r == 142857)
