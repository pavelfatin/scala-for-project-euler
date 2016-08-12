def rotations(n: Int) = {
    val s = n.toString
    (0 until s.length).map(x => (s.drop(x) + s.take(x)).toInt)
}

def isPrime(n: Int) = (n > 1) && (2 to math.sqrt(n).toInt).forall(n % _ != 0)

val r = (2 until 1000000).count(rotations(_).forall(isPrime))

assert(r == 55)
