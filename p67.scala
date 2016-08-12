val grid = io.Source.fromFile("p067_triangle.txt").getLines
  .map(_.split(" ").map(_.toInt)).toArray

def f(rows: Array[Array[Int]], bottom: Seq[Int]): Int = {
  val ms = bottom.zip(bottom.tail).map(p => p._1 max p._2)
  val ss = rows.last.zip(ms).map(p => p._1 + p._2)
  if (ss.length == 1) ss.head else f(rows.init, ss)
}

val r = f(grid.init, grid.last)

assert(r == 7273)
