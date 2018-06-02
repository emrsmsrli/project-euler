import org.junit.Assert
import org.junit.Test
import twentyfive.diffSumAndSquare
import twentyfive.squareOfSums
import twentyfive.sumOfSquares

class T6 {
    @Test fun testSquareOfSums() {
        Assert.assertEquals(385, sumOfSquares(10))
    }

    @Test fun testSumOfSquares() {
        Assert.assertEquals(3025, squareOfSums(10))
    }

    @Test fun testDifference() {
        Assert.assertEquals(2640, diffSumAndSquare(10))
        Assert.assertEquals(25164150, diffSumAndSquare(100))
    }
}