def cf(d: Int, m: Int, a: Int, n: Int, num1: BigInt, num2: BigInt,
  den1: BigInt, den2: BigInt): Stream[(BigInt, BigInt)] = {
  val m1 = d * a - m
  val d1 = (n - m1 * m1) / d
  val a1 = (math.sqrt(n).toInt + m1) / d1
  val num = a1 * num1 + num2
  val den = a1 * den1 + den2
  (num, den) #:: cf(d1, m1, a1, n, num, num1, den, den1)
}

val r = (2 to 1000).filterNot(n =>
  n == math.sqrt(n).toInt * math.sqrt(n).toInt
).maxBy(d => {
  val m = math.sqrt(d).toInt
  val p = cf(1, 0, m, d, m, 1, 1, 0)
    .find{ case (x, y) => x * x - d * y * y == 1 }.get
  p._1
})

assert(r == 661)
