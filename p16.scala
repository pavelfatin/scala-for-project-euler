val r = BigInt(2).pow(1000).toString.view.map(_.asDigit).sum

assert(r == 1366) // 1 ms