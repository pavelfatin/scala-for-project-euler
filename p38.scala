def product(n: Int, r: Range) = r.foldLeft(""){
  (a, b) => a + (b * n).toString
}

val limit = Stream.from(1)
  .find(d => (d.toString + (d * 2)).toInt > 987654321).get - 1

val rs = for {
  i <- 1 to limit; j <- 2 to 9; s = product(i, 1 to j)
  if s.length == 9 && (1 to 9).mkString.forall(s.contains(_))
} yield s.toInt

val r = rs.max

assert(r == 932718654)
