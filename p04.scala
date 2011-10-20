val r = (100 to 999).view
        .flatMap(i => (i to 999).map(i *))
        .filter(n => n.toString == n.toString.reverse)
        .max

assert(r == 906609) // 102 ms