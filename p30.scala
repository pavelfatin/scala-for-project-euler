def max(d: Int) = math.pow(10, d).toInt - 1

def sum(n: Int) = n.toString.map(_.asDigit)
  .map(math.pow(_, 5).toInt).sum

val limit = Stream.from(1).find(d => max(d) > sum(max(d))).get

val r = (2 to max(limit)).view.filter(n => n == sum(n)).sum

assert(r == 443839) // 2 s