def isPrime(n: Int) = (n > 1) && (2 to math.sqrt(n).toInt).forall(n % _ != 0)

def isPerm(a: Int, b: Int) = a.toString.sorted == b.toString.sorted

val primes = (2000 to 5000).filter(isPrime)

val rs = for (
  p1 <- primes.takeWhile(x => x * x < 10000000);
  p2 <- primes.dropWhile(_ <= p1).takeWhile(p1 * _ < 10000000)
  if isPerm(p1 * p2, (p1 - 1) * (p2 - 1))
) yield (p1 * p2, (p1 * p2).toDouble / ((p1 - 1) * (p2 - 1)))

val r = rs.minBy(_._2)._1

assert(r == 8319823)
