// https://projecteuler.net/problem=16

package twentyfive

import java.math.BigInteger

fun sumOfDigits(): Int {
    return BigInteger.valueOf(2).shiftLeft(999).toString().fold(0) { i, c -> i + c.toString().toInt() }
}