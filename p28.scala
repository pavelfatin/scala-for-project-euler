def cs(n: Int, p: Int): Stream[Int] = 
  (n * 4 + p * 10) #:: cs(n + p * 4, p + 2)

val r = 1 + cs(1, 2).take(500).sum

assert(r == 669171001) // 1 ms