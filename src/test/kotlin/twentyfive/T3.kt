package twentyfive

import org.junit.Assert
import org.junit.Test

class T3 {
    @Test fun testSmallestFactor() {
        Assert.assertEquals(3, smallestFactor(9))
        Assert.assertEquals(2, smallestFactor(16))
        Assert.assertEquals(2, smallestFactor(8))
        Assert.assertEquals(2, smallestFactor(4))
        Assert.assertEquals(2, smallestFactor(2))
    }

    @Test fun testLargestFactor() {
        Assert.assertEquals(2, largestFactor(16))
        Assert.assertEquals(19, largestFactor(19))
        Assert.assertEquals(3, largestFactor(18))
        Assert.assertEquals(6857, largestFactor(600_851_475_143))
    }
}