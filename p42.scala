def isTriNum(n: Int): Boolean = {
  val x = math.sqrt(n*2).toInt
  2 * n == x * (x+1)
}

val r = io.Source.fromFile("words.txt").mkString.split(",")
  .map(_.init.tail.map(_ - 64).sum).filter(isTriNum).size

assert(r == 162)
