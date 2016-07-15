val ways = 1 +: Array.fill(100)(0)

for (i <- 1 until 100; j <- i to 100) ways(j) += ways(j - i)

val r = ways(100)

assert(r == 190569291)
