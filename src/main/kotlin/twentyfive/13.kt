// https://projecteuler.net/problem=013

package twentyfive

import java.math.BigInteger

fun sumBigIntegers(ints: List<String>): String {
    return ints.fold(BigInteger.ZERO) { i1, i2 -> i1.plus(BigInteger(i2)) }.toString()
}