// https://projecteuler.net/problem=7

package twentyfive

// https://stackoverflow.com/a/9704912
fun nthPrime(n: Int): Int {
    if(n < 2) return 2
    if(n == 2) return 3
    var limit = (n * (Math.log(n.toDouble()) + Math.log(Math.log(n.toDouble())))).toInt() + 3
    var root = Math.sqrt(limit.toDouble()).toInt() + 1
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

fun main(args: Array<String>) {
    println(nthPrime(1))
    println(nthPrime(2))
    println(nthPrime(3))
    println(nthPrime(10001))
}