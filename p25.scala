lazy val fs: Stream[BigInt] = 
  0 #:: 1 #:: fs.zip(fs.tail).map(p => p._1 + p._2)

val r = fs.view.takeWhile(_.toString.length < 1000).size

assert(r == 4782) // 468 ms