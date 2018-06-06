// https://projecteuler.net/problem=23

package twentyfive

import util.sumOfEvenDivisors

fun findNotAbundantDivisibleNumbers(): Int {
    val abundantNumberCache = mutableListOf<Int>()
    fun isAbundant(n: Int): Boolean {
        if(n < 10)
            return false
        if(abundantNumberCache.contains(n))
            return true
        if(n.sumOfEvenDivisors() > n) {
            abundantNumberCache.add(n)
            return true
        }
        return false
    }

    val abundants = mutableListOf<Int>()
    for(i in 1..28123)
        if(isAbundant(i))
            abundants.add(i)
    val isSumOfTwoAbundants = BooleanArray(28123 + 1)
    for(i in 0 until abundants.size)
        for(j in i until abundants.size)
            if(abundants[i] + abundants[j] <= 28123)
                isSumOfTwoAbundants[abundants[i] + abundants[j]] = true
            else break

    return (1..28123).filter { !isSumOfTwoAbundants[it] }.sum()
}