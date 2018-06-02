import org.junit.Assert
import org.junit.Test
import twentyfive.fib
import twentyfive.sumOfEvenValuedTermsInFibNotExceeding4Million

class T2 {
    @Test fun fibUntil10() {
        val nums = mutableSetOf<Long>()
        fib(10, nums)
        Assert.assertEquals("1, 2, 3, 5, 8", nums.joinToString())
    }

    @Test fun sumOfEvenFibUntil4Million() {
        Assert.assertEquals(4613732, sumOfEvenValuedTermsInFibNotExceeding4Million())
    }
}