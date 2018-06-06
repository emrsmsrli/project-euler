package twentyfive

import org.junit.Assert
import org.junit.Test

class T24 {
    @Test fun testNextPermutation() {
        val arr = intArrayOf(1, 2, 3)
        val nextPerm = intArrayOf(1, 3, 2)
        nextPermutation(arr)
        Assert.assertArrayEquals(nextPerm, arr)
    }

    @Test fun testFindMillionthPermutation() {
        Assert.assertEquals("2783915460", findMillionthPermutation())
    }
}