package twentyfive

import org.junit.Assert
import org.junit.Test
import java.util.*

class T11 {
    @Test fun testMaxAdjacentMult() {
        val grid = Scanner(javaClass.getResourceAsStream("numberGrid.txt")).use {
            val list = mutableListOf<IntArray>()
            while(it.hasNextLine())
                list.add(it.nextLine().split(' ').map { it.toInt() }.toIntArray())
            list.toTypedArray()
        }

        Assert.assertEquals(99, findMaxAdjacentMult(grid, 1))
        Assert.assertEquals(70600674, findMaxAdjacentMult(grid))
    }
}