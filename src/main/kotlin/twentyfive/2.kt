// https://projecteuler.net/problem=2

package twentyfive

import util.isEven

fun sumOfEvenValuedTermsInFibNotExceeding4Million(): Long {
    val nums = mutableSetOf<Long>()
    fib(4_000_000, nums)
    return nums.filter { it.isEven() }.sum()
}

tailrec fun fib(limit: Long, nums: MutableSet<Long>, t1: Long = 0L, t2: Long = 1L) {
    if(t2 > limit)
        return
    nums.add(t2)
    fib(limit, nums, t2, t1 + t2)
}