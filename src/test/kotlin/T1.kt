import org.junit.Assert
import org.junit.Test
import twentyfive.sumOfMultiplesOf3Or5
import twentyfive.sumOfMultiplesOf3Or5Until1000

class T1 {
    @Test fun testSumUntilTen() {
        Assert.assertEquals(23, sumOfMultiplesOf3Or5(10))
    }

    @Test fun testSumUntilThousand() {
        Assert.assertEquals(233168, sumOfMultiplesOf3Or5Until1000())
    }
}