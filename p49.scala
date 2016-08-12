def isPrime(n: Int) = (n > 2) && (2 to math.sqrt(n).toInt).forall(n % _ != 0)

val primes = (1000 to 9999).filter(isPrime)

val rs = for {
  i <- primes
  j <- primes.reverse
  if i < j && isPrime((i + j) / 2) &&
  i.toString.sorted == j.toString.sorted &&
  i.toString.sorted == ((i + j) / 2).toString.sorted
} yield i.toString + (i + j) / 2 + j

val r = rs.last.toLong

assert(r == 296962999629L)
