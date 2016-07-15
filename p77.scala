def isPrime(n: Int) = (n > 1) && (2 to math.sqrt(n).toInt).forall(n % _ != 0)

def ways(n: Int, m: Int): Int = {
  if (n == 0) { if (isPrime(m)) 1 else 0 }
  else if (m == 1) 0
  else if (n < m) ways(n, n)
  else if (isPrime(m)) ways(n - m, m) + ways(n, m - 1)
  else ways(n, m - 1)
}

val r = Stream.from(5).find(n => ways(n, n) > 5000).get

assert(r == 71)
