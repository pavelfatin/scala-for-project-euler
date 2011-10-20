val s = """<raw input data>"""

val r = s.filter(_.isDigit).map(_.asDigit).sliding(5)
        .map(_.product).max

assert(r == 40824) // 33 ms