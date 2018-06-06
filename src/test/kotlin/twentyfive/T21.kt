package twentyfive

import org.junit.Assert
import org.junit.Test

class T21 {
    @Test fun testSumOfAmicibleNumbers() {
        Assert.assertEquals(504, sumOfAmicibleNumbersUntil(500))
        Assert.assertEquals(31626, sumOfAmicibleNumbersUntil(10_000))
    }
}