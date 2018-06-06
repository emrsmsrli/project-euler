package twentyfive

import org.junit.Assert
import org.junit.Test

class T19 {
    @Test fun testFindSundayCount() {
        Assert.assertEquals(2, findSundayCountBetween(2000, 2001))
        Assert.assertEquals(171, findSundayCountBetween(1901, 2000))
    }
}