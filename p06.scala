val numbers = 1 to 100

def square(n: Int) = n * n

val r = square(numbers.sum) - numbers.map(square).sum

assert(r == 25164150) // 1 ms