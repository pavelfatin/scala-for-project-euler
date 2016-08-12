def isPrime(n: Int) = (n > 1) && (2 to math.sqrt(n).toInt).forall(n % _ != 0)

val r = Stream.from(2).filter(isPrime).scanLeft(1)(_ * _)
  .takeWhile(_ < 1000000).last

assert(r == 510510)
