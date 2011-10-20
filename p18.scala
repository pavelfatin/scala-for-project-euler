val s = """<raw input data"""

val grid = s.trim.split("\n").map(_.split("\\s+").map(_.toInt))

def f(rows: Array[Array[Int]], bottom:Seq[Int]): Int = {
  val ms = bottom.zip(bottom.tail).map(p => p._1 max p._2)
  val ss = rows.last.zip(ms).map(p => p._1 + p._2)
  if(ss.size == 1) ss.head else f(rows.init, ss)
}

val r = f(grid.init, grid.last)

assert(r == 1074) // 2 ms