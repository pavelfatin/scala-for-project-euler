def isPrime(n: Int) = (n > 1) && (2 to math.sqrt(n).toInt).forall(n % _ != 0)

def notTrue(n: Int) = (1 to math.sqrt(n / 2).toInt)
  .forall(i => !isPrime(n - 2 * i * i))

val cn = Stream.from(2).filter(x => x % 2 == 1 && !isPrime(x))

val r = cn.find(notTrue).get

assert(r == 5777)
