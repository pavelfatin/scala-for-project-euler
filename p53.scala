def factorial(n: Int): BigInt = if (n > 0) n * factorial(n-1) else 1

def nCr(n: Int, r: Int) = factorial(n) / factorial(r) / factorial(n - r)

val r = (23 to 100).map(n => (1 to n).count(nCr(n, _) > 1000000)).sum

assert(r == 4075)
