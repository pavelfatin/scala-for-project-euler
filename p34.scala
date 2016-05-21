def max(d: Int) = math.pow(10, d).toInt - 1

def factorial(n: Int): Int = if (n == 0) 1 else n * factorial(n-1)

val limit = Stream.from(1)
  .find(d => max(d) > max(d).toString.map(x => factorial(x.asDigit)).sum).get

val r = (3 to max(limit))
  .filter(n => n == n.toString.map(c => factorial(c.asDigit)).sum).sum

assert(r == 40730)
