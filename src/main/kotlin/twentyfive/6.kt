// https://projecteuler.net/problem=6

package twentyfive

import util.pow

fun sumOfSquares(n: Int): Int {
    return (1..n).sumBy { it.pow(2) }
}

fun squareOfSums(n: Int): Int {
    return (1..n).sum().pow(2)
}

fun diffSumAndSquare(n: Int): Int {
    return squareOfSums(n) - sumOfSquares(n)
}