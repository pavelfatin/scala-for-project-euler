lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(i =>
  ps.takeWhile(j => j * j <= i).forall(i % _ > 0))

val r = ps.view.takeWhile(_ < 2000000).foldLeft(0L)(_ + _)

assert(r == 142913828922L) // 1 s