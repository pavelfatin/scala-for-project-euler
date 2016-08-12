def isPrime(n: Int) = (n > 1) && (2 to math.sqrt(n).toInt).forall(n % _ != 0)

def cs(n: Int, p: Int): Stream[Int] =
  (1 to 4).map(_ * p + n).count(isPrime) #:: cs(n + p * 4, p + 2)

val p = cs(1, 2).scanLeft(0)(_ + _).zipWithIndex.tail
  .find(x => x._1 * 100 < (x._2 * 4 + 1) * 10).get

val r = p._2 * 2 + 1

assert(r == 26241)
