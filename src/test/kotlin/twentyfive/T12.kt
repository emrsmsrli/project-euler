package twentyfive

import org.junit.Assert
import org.junit.Test

class T12 {
    @Test fun testTriangleNumber() {
        Assert.assertEquals(28, triangleNumber(7))
    }

    @Test fun testDivisorCount() {
        Assert.assertEquals(0, divisorCount(triangleNumber(1)))
        Assert.assertEquals(2, divisorCount(triangleNumber(2)))
        Assert.assertEquals(4, divisorCount(triangleNumber(3)))
        Assert.assertEquals(4, divisorCount(triangleNumber(4)))
        Assert.assertEquals(4, divisorCount(triangleNumber(5)))
    }

    @Test fun testFirstTriOverNDivisors() {
        Assert.assertEquals(3, firstTriangleOverNDivisors(1))
        Assert.assertEquals(6, firstTriangleOverNDivisors(2))
        Assert.assertEquals(28, firstTriangleOverNDivisors(5))
    }

    @Test fun testFirstTriOverNDivisorsFast() {
        Assert.assertEquals(3, firstTriangleOverNDivisorsFast(1))
        Assert.assertEquals(6, firstTriangleOverNDivisorsFast(2))
        Assert.assertEquals(28, firstTriangleOverNDivisorsFast(5))

        Assert.assertEquals(2031120, firstTriangleOverNDivisorsFast(200))
        Assert.assertEquals(76576500, firstTriangleOverNDivisorsFast(500))
    }
}