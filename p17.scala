val units = Array(0, 3, 3, 5, 4, 4, 3, 5, 5, 4, 3, 6, 6, 8, 8, 7, 
                  7, 9, 8, 8)

val tens = Array(0, 0, 6, 6, 5, 5, 5, 7, 6, 6)    

lazy val name: Int => Int = {
  case n if(n < 20) => units(n)
  case n if(n < 100) => 
    tens(n / 10) + (if(n % 10 > 0) units(n % 10) else 0)
  case n if(n < 1000) => 
    name(n / 100) + 7 + (if(n % 100 > 0) 3 + name(n % 100) else 0)
  case 1000 => 11
}

val r = (1 to 1000).map(name).sum

assert(r == 21124) // 1 ms