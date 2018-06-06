// https://projecteuler.net/problem=21

package twentyfive

import util.sumOfEvenDivisors

fun sumOfAmicibleNumbersUntil(n: Int): Int {
    var sum = 0
    for(a in 2 until n) {
        val b = a.sumOfEvenDivisors()
        if(b != a && b.sumOfEvenDivisors() == a)
            sum += a
    }
    return sum
}