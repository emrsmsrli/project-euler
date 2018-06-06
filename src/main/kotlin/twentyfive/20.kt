// https://projecteuler.net/problem=20

package twentyfive

import util.fact

fun factorialDigitSum(n: Int): Int {
    return n.fact().toString().map { it.toString().toInt() }.sum()
}