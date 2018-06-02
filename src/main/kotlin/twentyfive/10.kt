// https://projecteuler.net/problem=10

package twentyfive

fun sumOfPrimes(until: Int = 2_000_000): Long {
    return primes(until).fold(0L) { i, j -> i + j }
}

fun primes(n: Int): List<Int> {
    val primes = BooleanArray(n + 1)
    for(i in 2 until primes.size) {
        primes[i] = true
    }
    var num = 2
    while(true) {
        run {
            var i = 2
            while(true) {
                val multiple = num * i
                if(multiple > n) {
                    break
                } else {
                    primes[multiple] = false
                }
                i++
            }
        }
        var nextNumFound = false
        for(i in num + 1 until n + 1) {
            if(primes[i]) {
                num = i
                nextNumFound = true
                break
            }
        }
        if(!nextNumFound) {
            break
        }
    }

    return primes.indices.filter { primes[it] }
}