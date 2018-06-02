import org.junit.Assert
import org.junit.Test
import util.isEven
import util.sqrt

class Extensions {
    @Test fun testIsEven() {
        Assert.assertTrue(!1.isEven())
        Assert.assertTrue(2.isEven())
        Assert.assertTrue(!2_000_001.isEven())
        Assert.assertTrue(2_000_000.isEven())
    }

    @Test fun testSqrt() {
        Assert.assertEquals(2L, 4L.sqrt())
        Assert.assertEquals(15L, 255L.sqrt())
    }
}