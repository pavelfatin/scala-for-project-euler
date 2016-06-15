def pow3(n: Int) = math.pow(n, 3).toLong

val ps = Stream.from(1).map(n => (n, pow3(n).toString.sorted))

val pss = ps.map(p => ps.takeWhile(_._1 <= p._1).filter(_._2 == p._2))

val r = pow3(pss.find(_.size == 5).get.head._1)

assert(r == 127035954683L)
