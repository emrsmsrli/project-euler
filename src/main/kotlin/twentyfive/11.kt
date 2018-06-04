// https://projecteuler.net/problem=11

package twentyfive

import kotlin.math.max

fun findMaxAdjacentMult(grid: Array<IntArray>, adjacent: Int = 4): Int {
    fun inside(y: Int, x: Int) = y in grid.indices && x in grid[y].indices

    fun get(y: Int, x: Int, dy: Int, dx: Int): Int {
        if(!inside(y + (adjacent - 1) * dy, x + (adjacent - 1) * dx))
            return -1
        var p = 1
        var yy = y
        var xx = x
        for(i in 0 until adjacent) {
            p *= grid[yy][xx]
            yy += dy
            xx += dx
        }
        return p
    }

    var m = -1
    for(i in 0 until grid.size) {
        for(j in 0 until grid[i].size) {
            m = max(get(i, j, 0, 1), m)
            m = max(get(i, j, 1, 0), m)
            m = max(get(i, j, 1, 1), m)
            m = max(get(i, j, -1, 1), m)
        }
    }
    return m
}
