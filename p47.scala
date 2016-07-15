def f(n: Int): List[Int] = {
  def go(a: Int, b: Int): List[Int] = {
    if (a < b * b) List(a)
    else if (a % b == 0) b :: go(a / b, b)
    else go(a, b + 1)
  }
  go(n, 2)
}

val r = Stream.from(1).find(n =>
  (n until n + 4).forall(f(_).distinct.size == 4)
).get

assert(r == 134043)
