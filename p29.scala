val r = (2 to 100).flatMap(a => (2 to 100)
  .map(b => BigInt(a).pow(b))).distinct.length

assert(r == 9183) // 17 ms
