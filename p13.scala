val s = """<raw input data"""

val r = s.split("\\s+").map(_.take(11).toLong).sum.toString
        .take(10).toLong

assert(r == 5537376230L) // 2 ms