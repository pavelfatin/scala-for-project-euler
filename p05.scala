def gcd(a: Int, b: Int): Int = if (a % b == 0) b else gcd(b, a % b)

def lcm(a: Int, b: Int): Int = a * (b / gcd(a, b))

val r = (1 to 20).reduce(lcm)

assert(r == 232792560)
