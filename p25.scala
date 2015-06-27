lazy val fs: Stream[BigInt] = 0 #:: fs.scanLeft(BigInt(1))(_ + _)

val r = fs.view.takeWhile(_.toString.length < 1000).length

assert(r == 4782) // 468 ms
