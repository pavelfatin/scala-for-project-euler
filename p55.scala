def isPalindrome(n: BigInt) = n.toString == n.toString.reverse

def ns(n: BigInt): Stream[BigInt] = n #:: ns(n + BigInt(n.toString.reverse))

val r = (1 until 10000).count(ns(_).tail.take(50).forall(!isPalindrome(_)))

assert(r == 249)
