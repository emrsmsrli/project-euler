package twentyfive

import org.junit.Assert
import org.junit.Test
import java.util.*

class T8 {
    @Test fun testGreatestProduct() {
        val thousandDigitNumber = Scanner(javaClass.getResourceAsStream("thousandDigitNumber.txt"))
                .use { it.nextLine() }
        Assert.assertEquals(5832, findGreatestProduct(thousandDigitNumber, 4))
        Assert.assertEquals(23514624000L, findGreatestProduct(thousandDigitNumber, 13))
    }
}