package util

import org.junit.Assert
import org.junit.Test

class Extensions {
    @Test fun testFact() {
        Assert.assertEquals(1, 0.fact())
        Assert.assertEquals(1, 1.fact())
        Assert.assertEquals(2, 2.fact())
        Assert.assertEquals(120, 5.fact())
    }

    @Test fun testIsEven() {
        Assert.assertFalse(1.isEven())
        Assert.assertTrue(2.isEven())
        Assert.assertFalse(2_000_001.isEven())
        Assert.assertTrue(2_000_000.isEven())
    }

    @Test fun testIsLeapYear() {
        Assert.assertTrue(2000.isLeapYear())
        Assert.assertTrue(2004.isLeapYear())
        Assert.assertFalse(2005.isLeapYear())
    }

    @Test fun testSqrt() {
        Assert.assertEquals(2L, 4L.sqrt())
        Assert.assertEquals(15L, 255L.sqrt())
        Assert.assertNotEquals(2L, 9L.sqrt())
    }

    @Test fun testIsPalindrome() {
        Assert.assertTrue("testtset".isPalindrome())
        Assert.assertTrue("10022001".isPalindrome())
        Assert.assertFalse("emre".isPalindrome())
    }

    @Test fun testPow() {
        Assert.assertNotEquals(3, 2.pow(2))
        Assert.assertEquals(4, 2.pow(2))
        Assert.assertEquals(32, 2.pow(5))
        Assert.assertEquals(512, 2.pow(9))
    }
}