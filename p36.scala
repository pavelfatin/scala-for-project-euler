def isPalindrome(n: String) = n == n.reverse

val r = (1 to 1000000)
  .filter(x => isPalindrome(x.toString) && isPalindrome(x.toBinaryString)).sum

assert(r == 872187)
