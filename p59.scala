def pilesN(c: List[Int], n: Int) = {
  val x = c.grouped(n).toList
  val y = x.init.transpose
  y.indices.map(i => y(i) ::: x.last.lift(i).toList)
}

val codes = io.Source.fromFile("p059_cipher.txt").mkString.split(",")
  .map(_.stripLineEnd.toInt).toList

val key = pilesN(codes, 3).map(x => x.distinct.maxBy(y => x.count(_ == y)))
  .map(_ ^ ' ')

var r = codes.grouped(3).map(_.zip(key).map(x => (x._1 ^ x._2))).flatten.sum

assert(r == 107359)
