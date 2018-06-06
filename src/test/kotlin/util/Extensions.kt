package util

import org.junit.Assert
import org.junit.Test
import java.math.BigInteger

class Extensions {
    @Test fun testFact() {
        Assert.assertEquals(BigInteger.ONE, 0.fact())
        Assert.assertEquals(BigInteger.ONE, 1.fact())
        Assert.assertEquals(BigInteger.valueOf(2L), 2.fact())
        Assert.assertEquals(BigInteger.valueOf(120L), 5.fact())
    }

    @Test fun testIsEven() {
        Assert.assertFalse(1.isEven())
        Assert.assertTrue(2.isEven())
        Assert.assertFalse(2_000_001.isEven())
        Assert.assertTrue(2_000_000.isEven())
    }

    @Test fun testSumOfDivisors() {
        Assert.assertEquals(3, 2.sumOfDivisors())
    }

    @Test fun testSumOfEvenDivisors() {
        Assert.assertEquals(1, 2.sumOfEvenDivisors())
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