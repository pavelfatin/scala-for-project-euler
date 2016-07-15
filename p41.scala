def isPrime(n: Int) = (n > 1) && (2 to math.sqrt(n).toInt).forall(n % _ != 0)

val r = "123456789".inits.filter(_.nonEmpty)
  .flatMap(_.permutations.map(_.toInt)).filter(isPrime).max

assert(r == 7652413)
