lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(i =>
  ps.takeWhile(j => j * j <= i).forall(i % _ > 0))

val n = 600851475143L

val limit = math.sqrt(n)

val r = ps.view.takeWhile(_ < limit).filter(n % _ == 0).last

assert(r == 6857) // 265 ms