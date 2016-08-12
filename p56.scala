val rs = for (
  i <- 1 until 100;
  j <- 1 until 100
) yield BigInt(i).pow(j).toString.map(_.asDigit).sum

val r = rs.max

assert(r == 972)
