def isPrime(n: Int) = (n > 1) && (2 to math.sqrt(n).toInt).forall(n % _ != 0)

val ps = (2 to 1000000).filter(isPrime).scanLeft(0L)(_ + _).tail

val rs = for (
  i <- ps.indices;
  j <- ps.takeWhile(_ < i).indices
  if ps(i) - ps(j) < 1000000 && isPrime((ps(i) - ps(j)).toInt)
) yield (i - j, ps(i) - ps(j))

val r = rs.maxBy(_._1)._2

assert(r == 997651)
