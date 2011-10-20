val limit = (1 to 1000).find(n => n + math.sqrt(n) >= 1000).get

val rs = for(b <- 2 until limit; a <- 1 until b; c = 1000 - a - b
             if a * a + b * b  == c * c) yield a * b * c

val r = rs(0)

assert(r == 31875000) // 32 ms