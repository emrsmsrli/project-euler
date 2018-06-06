package twentyfive

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.util.*

class T18 {
    private lateinit var tri1: String
    private lateinit var tri2: String

    private fun load(txt: String): String {
        return Scanner(javaClass.getResourceAsStream(txt)).use {
            val sb = StringBuilder(128)
            while(it.hasNextLine())
                sb.append(it.nextLine()).append('\n')
            sb.toString()
        }
    }

    @Before fun init() {
        tri1 = load("tri1.txt")
        tri2 = load("tri2.txt")
    }

    @Test fun testParseTriangle() {
        Assert.assertArrayEquals(arrayOf(intArrayOf(3), intArrayOf(7, 4),
                intArrayOf(2, 4, 6), intArrayOf(8, 5, 9, 3)),
                parseTriangle(tri1))
    }

    @Test fun tesFindMaxPathSum() {
        Assert.assertEquals(23, findMaxPathSum(tri1))
        Assert.assertEquals(1074, findMaxPathSum(tri2))
    }

    @Test fun testFindMaxPathSumFast() {
        Assert.assertEquals(23, findMaxPathSumFast(tri1))
        Assert.assertEquals(1074, findMaxPathSumFast(tri2))
    }
}