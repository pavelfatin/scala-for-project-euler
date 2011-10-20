def from(n: Long, c: Int = 0): Int = if(n == 1) c + 1 else 
  from(if(n % 2 == 0) n / 2 else 3 * n + 1, c + 1)

val r = (1 until 1000000).view.map(n => (n, from(n)))
  .reduceLeft((a, b) => if(a._2 > b._2) a else b)._1

assert(r == 837799) // 1 s