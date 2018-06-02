package twentyfive

import org.junit.Assert
import org.junit.Test
import twentyfive.nthPrime

class T7 {
    @Test fun testNthPrime() {
        Assert.assertNotEquals(1, nthPrime(0))
        Assert.assertEquals(2, nthPrime(1))
        Assert.assertEquals(3, nthPrime(2))
        Assert.assertEquals(104743, nthPrime(10001))
    }
}