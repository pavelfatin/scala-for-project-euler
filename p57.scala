def fs(n: BigInt, d: BigInt): Stream[(BigInt, BigInt)] = 
  (n, d) #:: fs(n + d * 2, n + d)
  
val r = fs(3, 2).take(999)
  .filter(p => p._1.toString.size > p._2.toString.size).size

assert(r == 153)
