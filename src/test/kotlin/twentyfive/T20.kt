package twentyfive

import org.junit.Assert
import org.junit.Test

class T20 {
    @Test fun testFactorialDigitSum() {
        Assert.assertEquals(3, factorialDigitSum(5))
        Assert.assertEquals(648, factorialDigitSum(100))
    }
}