val ps = (2 until 1000).map(i => (1 to 2000)
         .find(BigInt(10).modPow(_, i) == 1)) 

val r = 2 + ps.indexOf(Some(ps.flatten.max)) 

assert(r == 983) // 2 s