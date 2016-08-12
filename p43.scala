val primes = List(2, 3, 5, 7, 11, 13, 17)

def s(ns: String) = ns.tail.sliding(3).zipWithIndex

val r = (for {
  i <- (0 to 9).mkString.permutations
  if s(i).forall(x => x._1.toInt % primes(x._2) == 0)
} yield i.toLong).sum

assert(r == 16695334890L)
