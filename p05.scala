val r = Range(20, Int.MaxValue)
  .find(n => Range(2, 21).forall(n % _ == 0)).get

assert(r == 232792560) // 23 s
