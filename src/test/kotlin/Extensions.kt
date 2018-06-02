import org.junit.Assert
import org.junit.Test
import util.isEven
import util.isPalindrome
import util.pow
import util.sqrt

class Extensions {
    @Test fun testIsEven() {
        Assert.assertFalse(1.isEven())
        Assert.assertTrue(2.isEven())
        Assert.assertFalse(2_000_001.isEven())
        Assert.assertTrue(2_000_000.isEven())
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