def fs(n: Int, d: Int): Stream[(Int, Int)] =
  (n, d) #:: fs(n + 3, d + 7)

val r = fs(2, 5).takeWhile(_._2 < 1000000).last._1

assert(r == 428570)
