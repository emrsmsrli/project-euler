// https://projecteuler.net/problem=2

package twentyfive

import util.isEven

fun sumOfEvenValuedTermsInFibNotExceeding4Million(): Long {
    val nums = mutableSetOf<Long>()
    fib(4_000_000, nums)
    return nums.filter { it.isEven() }.sum()
}

fun fib(limit: Long, nums: MutableSet<Long>) = fib(limit, 0, 1, nums)

tailrec fun fib(limit: Long, t1: Long, t2: Long, nums: MutableSet<Long>) {
    if(t2 > limit)
        return
    nums.add(t2)
    fib(limit, t2, t1 + t2, nums)
}