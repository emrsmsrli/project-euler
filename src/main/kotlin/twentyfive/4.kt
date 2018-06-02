// https://projecteuler.net/problem=4

package twentyfive

import util.isPalindrome

fun maxPalindrome(from: Int = 100, to: Int = 999): Int {
    var max = -1
    for(i in to downTo from) {
        inner@ for(j in to downTo from) {
            val num = i * j
            if(num.toString().isPalindrome() && num > max)
                max = num
        }
    }
    return max
}