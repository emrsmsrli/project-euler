package twentyfive

import org.junit.Assert
import org.junit.Test
import java.util.*

class T13 {
    @Test fun testSumBigInts() {
        val nums = Scanner(javaClass.getResourceAsStream("bigInts.txt")).use {
            val list = mutableListOf<String>()
            while(it.hasNextLine())
                list.add(it.nextLine())
            list
        }

        Assert.assertEquals("5537376230390876637302048746832985971773659831892672", sumBigIntegers(nums))
    }
}