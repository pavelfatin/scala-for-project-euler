val limit = 1000000

val phi = (0L to limit).toArray

for (
  i <- 2 to limit if phi(i) == i;
  j <- i to limit by i
) phi(j) = phi(j) / i * (i - 1)

val r = phi.drop(2).sum

assert(r == 303963552391L)
