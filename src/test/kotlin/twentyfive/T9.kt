package twentyfive

import org.junit.Assert
import org.junit.Test

class T9 {
    @Test fun testIsPythagorean() {
        Assert.assertTrue(isPythagorean(3, 4, 5))
        Assert.assertFalse(isPythagorean(3, 4, 6))
    }

    @Test fun testSpecialPythagoreanTriplet() {
        Assert.assertEquals(31875000, specialPythagoreanTriplet(1000))
    }
}