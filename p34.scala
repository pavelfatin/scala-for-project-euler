def max(d: Int) = math.pow(10, d).toInt - 1

val f = List(1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880)

def g(n: Int) = n.toString.map(d => f(d.asDigit)).sum

val limit = Stream.from(1).find(d => max(d) > g(max(d))).get

val r = (3 to max(limit)).filter(n => n == g(n)).sum

assert(r == 40730)
