// https://projecteuler.net/problem=8

package twentyfive

fun findGreatestProduct(ints: String, windowSize: Int): Long {
    if(ints.length < windowSize)
        return 0L

    var max = -1L
    for(i in 0 until ints.length - windowSize) {
        val mult = ints
                .substring(i..(i + windowSize - 1))
                .map { it.toString().toInt() }
                .fold(1L) { i1, i2 -> i1 * i2 }
        if(mult > max)
            max = mult
    }
    return max
}