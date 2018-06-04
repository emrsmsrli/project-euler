// https://projecteuler.net/problem=10

package twentyfive

import util.Primes

fun sumOfPrimes(until: Int = 2_000_000): Long {
    return Primes.takeUntil(until).fold(0L) { i, j -> i + j }
}