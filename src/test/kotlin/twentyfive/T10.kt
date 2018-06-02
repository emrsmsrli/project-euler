package twentyfive

import org.junit.Assert
import org.junit.Test

class T10 {
    @Test fun testPrimes() {
        Assert.assertEquals("2, 3", primes(3).joinToString())
        Assert.assertEquals("2, 3, 5, 7", primes(10).joinToString())
    }

    @Test fun testSumOfPrimes() {
        Assert.assertEquals(5, sumOfPrimes(3))
        Assert.assertEquals(142913828922L, sumOfPrimes())
    }
}