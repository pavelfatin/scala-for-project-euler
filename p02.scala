lazy val fs: Stream[Int] = 0 #:: fs.scanLeft(1)(_ + _)

val r = fs.view.takeWhile(_ <= 4000000).filter(_ % 2 == 0).sum

assert(r == 4613732) // 1 ms
