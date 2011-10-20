def f(row: Seq[Long], c: Int): Long = {
  var s = 0L
  val next = row.map { n => s += n; s }
  if(c == 0) next.last else f(next, c - 1)
}

def r(n: Int) = f(List.fill(n + 1)(1L), n - 1)

assert(r(20) == 137846528820L) // 1 ms