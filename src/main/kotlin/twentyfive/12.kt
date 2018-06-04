// https://projecteuler.net/problem=12

package twentyfive

import util.Primes
import util.pow
import kotlin.math.sqrt

fun triangleNumber(n: Int) = n * (n + 1) / 2

fun divisorCount(triangleNumber: Int): Int {
    var dCount = 1
        val sqr = sqrt(triangleNumber.toFloat()).toInt()
    for(i in 2..sqr)
        if(triangleNumber % i == 0)
            dCount += 2
    if(triangleNumber == sqr.pow(2))
        dCount--
    if(triangleNumber != 1)
        dCount++
    return dCount
}

fun firstTriangleOverNDivisors(nDivisors: Int): Int {
    var i = 1
    while(true) {
        val number = triangleNumber(i)
        if(divisorCount(number) > nDivisors)
            return number
        i++
    }
}

// https://projecteuler.net/overview=012
fun firstTriangleOverNDivisorsFast(nDivisors: Int): Int {
    if(nDivisors == 1)
        return 3
    var n = 3
    var dn = 2
    var c = 0
    var n1: Int
    var dn1: Int
    var exponent: Int

    val primes = Primes.takeUntil(1000)

    while(c <= nDivisors) {
        n++
        n1 = n
        if(n1 % 2 == 0)
            n1 /= 2
        dn1 = 1
        for(i in 0 until primes.size) {
            if(primes[i].pow(2) > n1) {
                dn1 *= 2
                break
            }
            exponent = 1
            while(n1 % primes[i] == 0) {
                exponent++
                n1 /= primes[i]
            }
            if(exponent > 1)
                dn1 *= exponent
            if(n1 == 1)
                break
        }
        c = dn * dn1
        dn = dn1
    }

    return n * (n - 1) / 2
}