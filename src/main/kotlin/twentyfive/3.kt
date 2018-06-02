// https://projecteuler.net/problem=3

package twentyfive

import util.sqrt

tailrec fun largestFactor(n: Long = 600851475143L): Long {
    val factor = smallestFactor(n)
    if(factor >= n)
        return n
    return largestFactor(n / factor)
}

fun smallestFactor(n: Long): Long {
    for(i in 2..n.sqrt())
        if(n % i == 0L)
            return i
    return n
}