package twentyfive

import org.junit.Assert
import org.junit.Test

class T5 {
    @Test fun testDivisibility() {
        Assert.assertEquals(232792560, smallestNumberDivisibleByNumbersOneTo20())
    }
}