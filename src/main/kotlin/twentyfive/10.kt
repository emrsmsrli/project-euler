// https://projecteuler.net/problem=10

package twentyfive

import util.primes

fun sumOfPrimes(until: Int = 2_000_000): Long {
    return primes(until).fold(0L) { i, j -> i + j }
}