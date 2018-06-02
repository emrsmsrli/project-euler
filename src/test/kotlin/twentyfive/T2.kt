package twentyfive

import org.junit.Assert
import org.junit.Test

class T2 {
    @Test fun testFibonacciUntilTen() {
        val nums = mutableSetOf<Long>()
        fib(10, nums)
        Assert.assertEquals("1, 2, 3, 5, 8", nums.joinToString())
    }

    @Test fun testFibonacciSumUntilFourMillion() {
        Assert.assertEquals(4613732, sumOfEvenValuedTermsInFibNotExceeding4Million())
    }
}