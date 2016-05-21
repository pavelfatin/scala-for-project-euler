def isPrime(n: Int) = (n > 1) && (2 to math.sqrt(n).toInt).forall(n % _ != 0)

def isTrue(n: Int) = Stream.from(1).takeWhile(i => 2 * i * i < n)
  .exists(i => isPrime(n - 2 * i * i))

val cn = Stream.from(2).filter(x => x % 2 == 1 && !isPrime(x))

val r = cn.find(!isTrue(_)).get

assert(r == 5777)
