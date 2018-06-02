package twentyfive

import util.pow

fun isPythagorean(a: Int, b: Int, c: Int): Boolean {
    return a.pow(2) + b.pow(2) == c.pow(2)
}

fun specialPythagoreanTriplet(n: Int): Int {
    for(a in 1 until n)
        for(b in (a + 1) until n) {
            val c = 1000 - a - b
            if(isPythagorean(a, b, c))
                return a * b * c
        }
    return -1
}