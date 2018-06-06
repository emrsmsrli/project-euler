// https://projecteuler.net/problem=18

package twentyfive

import java.util.*
import kotlin.math.max

// brute force
fun findMaxPathSum(triangle: String): Int {
    val tri = parseTriangle(triangle)

    var max = -1
    fun traverse(y: Int, x: Int, total: Int = 0) {
        if(y == tri.size - 1) {
            max = max(total + tri[y][x], max)
            return
        }

        for(xx in arrayOf(x, x + 1))
            traverse(y + 1, xx, total + tri[y][x])
    }

    traverse(0, 0)
    return max
}

// dynamic programming
fun findMaxPathSumFast(triangle: String): Int {
    val tri = parseTriangle(triangle)
    for(i in tri.size - 2 downTo 0)
        for(j in tri[i].indices)
            tri[i][j] += max(tri[i + 1][j], tri[i + 1][j + 1])
    return tri[0][0]
}

fun parseTriangle(triangle: String): Array<IntArray> {
    return Scanner(triangle).use {
        val list = mutableListOf<IntArray>()
        while(it.hasNextLine())
            list.add(it.nextLine().split(' ').map { it.toInt() }.toIntArray())
        list.toTypedArray()
    }
}