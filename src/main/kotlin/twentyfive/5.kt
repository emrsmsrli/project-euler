// https://projecteuler.net/problem=5

package twentyfive

import util.pow
import util.primes
import util.sqrt
import kotlin.math.floor
import kotlin.math.ln

fun smallestNumberDivisibleByNumbersOneTo20(): Int {
    val p = primes(50)
    val k = 20L
    var n = 1
    var i = 0
    var check = true
    val limit = k.sqrt()
    val logK = ln(k.toDouble())

    while(p[i] <= k) {
        var a = 1
        if(check) {
            if(p[i] <= limit)
                a = floor(logK / ln(p[i].toFloat())).toInt()
            else
                check = false
        }
        n *= p[i].pow(a)
        i++
    }

    return n
}