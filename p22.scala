val r = io.Source.fromFile("names.txt").mkString.split(",")
        .map(_.init.tail).sorted.map(_.map(_ - 64).sum)
        .zipWithIndex.map(p => p._1 * (p._2 + 1)).sum

assert(r == 871198282) // 38 ms