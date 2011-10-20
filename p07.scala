lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(i =>
  ps.takeWhile(j => j * j <= i).forall(i % _ > 0))

val r = ps(10000)

assert(r == 104743) // 24 ms