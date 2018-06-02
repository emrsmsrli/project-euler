import org.junit.Assert
import org.junit.Test
import util.isEven
import util.sqrt

class Extensions {
    @Test fun oneIsNotEven() {
        Assert.assertTrue(!1.isEven())
    }

    @Test fun twoIsEven() {
        Assert.assertTrue(2.isEven())
    }

    @Test fun twoMillionAndOneIsNotEven() {
        Assert.assertTrue(!2_000_001.isEven())
    }

    @Test fun twoMillionIsEven() {
        Assert.assertTrue(2_000_000.isEven())
    }

    @Test fun sqrtOfFour() {
        Assert.assertEquals(2L, 4L.sqrt())
    }

    @Test fun sqrtOf255() {
        Assert.assertEquals(15L, 255L.sqrt())
    }
}