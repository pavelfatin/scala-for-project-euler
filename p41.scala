def isPrime(n: Int) = (n > 1) && (2 to math.sqrt(n).toInt).forall(n % _ != 0)

def s(ns: String) = (0 until ns.length).map(ns.dropRight(_))

val rs = for {
  i <- s((1 to 9).mkString)
  j <- i.permutations.map(_.toInt)
  if isPrime(j)
} yield j

val r = rs.max

assert(r == 7652413)
