// https://projecteuler.net/problem=4

package twentyfive

import util.isPalindrome

fun maxPalindome(from: Int = 100, to: Int = 999): Int {
    var max = -1
    for(i in from downTo to) {
        inner@ for(j in from downTo to) {
            val num = i * j
            if(num.toString().isPalindrome() && num > max)
                max = num
        }
    }
    return max
}