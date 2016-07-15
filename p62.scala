import scala.collection.mutable.HashMap

def c(n: Int) = math.pow(n, 3).toLong.toString.sorted

val hm = HashMap[String, List[Int]]()

val ps = Stream.from(0).map(n => {
  val v = hm.getOrElse(c(n), List[Int]())
  hm.update(c(n), v :+ n)
  v :+ n
})

val r = math.pow(ps.find(_.size == 5).get.head, 3).toLong

assert(r == 127035954683L)
