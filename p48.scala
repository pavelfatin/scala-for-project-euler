val r = (1 to 1000).map(x => BigInt(x).pow(x)).sum % 10000000000L

assert(r == 9110846700L)
