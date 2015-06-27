lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(i =>
  ps.takeWhile(j => j * j <= i).forall(i % _ > 0))

def isPrime(n: Int) = ps.view.takeWhile(_ <= n).contains(n)

val ns = (-999 until 1000).flatMap { a =>
  (-999 until 1000).map(b => (a, b, (0 to 1000).view
    .takeWhile(n => isPrime(n * n + a * n + b)).length))
}

val t = ns.reduceLeft((a, b) => if (a._3 > b._3) a else b)

val r = t._1 * t._2

assert(r == -59231) // 6 s
