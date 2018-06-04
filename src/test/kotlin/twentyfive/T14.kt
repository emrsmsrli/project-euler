package twentyfive

import org.junit.Assert
import org.junit.Test

class T14 {
    @Test fun testLongestCollatzSequenceStarter() {
        Assert.assertEquals(837799, longestCollatzSequenceStarter())
    }
}