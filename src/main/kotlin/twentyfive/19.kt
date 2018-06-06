// https://projecteuler.net/problem=19

package twentyfive

import util.isLeapYear

fun findSundayCountBetween(y1: Int, y2: Int): Int {
    var sundayCount = 0

    val daysOfMonths = intArrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 30)
    val dayLeap = mapOf(28 to 0, 29 to 1, 30 to 2, 31 to 3)

    var startOfMonth = 1
    for(y in y1..y2) {
        for(m in 0..11) {
            // pass last month of last year
            if(y == y2 && m == 11)
                continue

            var daysOfMonth = daysOfMonths[m]

            // february check
            if(y.isLeapYear() && m == 1)
                daysOfMonth++

            startOfMonth = (startOfMonth + dayLeap[daysOfMonth]!!) % 7

            if(startOfMonth == 6)
                sundayCount++
        }
    }

    return sundayCount
}