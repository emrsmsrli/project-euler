package twentyfive

import org.junit.Assert
import org.junit.Test

class T17 {
    @Test fun testCountLetters() {
        Assert.assertEquals(6, countLetters(2))
        Assert.assertEquals(21124, countLetters(1000))
    }
}