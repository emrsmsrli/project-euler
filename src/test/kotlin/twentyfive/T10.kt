package twentyfive

import org.junit.Assert
import org.junit.Test

class T10 {
    @Test fun testSumOfPrimes() {
        Assert.assertEquals(5, sumOfPrimes(3))
        Assert.assertEquals(142913828922L, sumOfPrimes())
    }
}