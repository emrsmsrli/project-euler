package twentyfive

import org.junit.Assert
import org.junit.Test
import java.math.BigInteger

class T15 {
    @Test fun testCombination() {
        Assert.assertEquals(BigInteger.valueOf(560), combination(16, 3))
        Assert.assertEquals(BigInteger.valueOf(137846528820), combination(40, 20))
    }

    @Test fun testLatticePaths() {
        Assert.assertEquals(BigInteger.valueOf(6), latticePathCount(2, 2))
        Assert.assertEquals(BigInteger.valueOf(137846528820), latticePathCount(20, 20))
    }
}