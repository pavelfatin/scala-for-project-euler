def isPrime(n: Int) = (n > 1) && (2 to math.sqrt(n).toInt).forall(n % _ != 0)

def s(n: Int) = {
  (0 until n.toString.length).map(n.toString.drop(_).toInt) ++:
  (1 until n.toString.length).map(n.toString.dropRight(_).toInt)
}

val r = Stream.from(10).filter(s(_).forall(isPrime)).take(11).sum

assert(r == 748317)
