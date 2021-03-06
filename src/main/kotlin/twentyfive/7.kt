// https://projecteuler.net/problem=7

package twentyfive

import kotlin.math.ln
import kotlin.math.sqrt

// https://stackoverflow.com/a/9704912
fun nthPrime(n: Int): Int {
    when(n) {
        in Int.MIN_VALUE..0 -> return -1
        1 -> return 2
        2 -> return 3
    }
    var limit = (n * (ln(n.toDouble()) + ln(Math.log(n.toDouble())))).toInt() + 3
    var root = sqrt(limit.toDouble()).toInt() + 1
    var count = 1
    limit = (limit - 1) / 2
    root = root / 2 - 1
    val sieve = BooleanArray(limit)
    for(i in 0 until root) {
        if(!sieve[i]) {
            ++count
            var j = 2 * i * (i + 3) + 3
            val p = 2 * i + 3
            while(j < limit) {
                sieve[j] = true
                j += p
            }
        }
    }
    var p: Int
    p = root
    while(count < n) {
        if(!sieve[p]) {
            ++count
        }
        ++p
    }
    return 2 * p + 1
}