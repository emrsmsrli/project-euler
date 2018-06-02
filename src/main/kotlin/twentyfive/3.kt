// https://projecteuler.net/problem=3

package twentyfive

import util.sqrt

fun main(args: Array<String>) {
    print(largestFactor(600851475143L))
}

tailrec fun largestFactor(n: Long): Long {
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