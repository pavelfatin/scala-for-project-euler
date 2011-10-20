val s = """<raw input data>"""

val ns = s.split("\\s+").map(_.toInt)

def m(i: Int, p: Int, c: Int): Int =
  if(c > 0) ns(i) * m(i + p, p, c - 1) else 1

def ms(xs: Seq[Int], ys: Seq[Int], p: Int) =
  ys.flatMap(y => xs.map(x => m(20 * y + x, p, 4)))

val ps = ms(0 to 19, 0 to 15, 20) ++ ms(0 to 15, 0 to 19, 1) ++ 
         ms(0 to 15, 0 to 15, 21) ++ ms(3 to 19, 0 to 15, 19)

val r = ps.max

assert(r == 70600674) // 4 ms