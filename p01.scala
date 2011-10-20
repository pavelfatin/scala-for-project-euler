val r = (1 until 1000).view.filter(n => n % 3 == 0 || n % 5 == 0).sum

assert(r == 233168) // 7 ms