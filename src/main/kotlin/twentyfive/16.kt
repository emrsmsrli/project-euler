// https://projecteuler.net/problem=16

package twentyfive

import java.math.BigInteger

fun sumOfDigits(): Int {
    return BigInteger.ONE.shiftLeft(1000).toString().fold(0) { i, c -> i + c.toString().toInt() }
}