def f(n: BigInt): BigInt = if (n < 2) 1 else n * f(n - 1)

val r = f(100).toString.view.map(_.asDigit).sum

assert(r == 648) // 1 ms
