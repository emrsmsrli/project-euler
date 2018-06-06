// https://projecteuler.net/problem=24

package twentyfive

import util.swap

// https://www.nayuki.io/page/next-lexicographical-permutation-algorithm
fun nextPermutation(arr: IntArray): Boolean {
    var i = arr.lastIndex
    while(i > 0 && arr[i - 1] >= arr[i])  i--
    if(i <= 0)
        return false

    run {
        var j = arr.lastIndex
        while(arr[j] <= arr[i - 1])
            j--
        arr.swap(i - 1, j)
    }

    var j = arr.lastIndex
    while(i < j) {
        arr.swap(i, j)
        i++; j--
    }
    return true
}

fun findMillionthPermutation(): String {
    val arr = IntArray(10) { it }
    for(i in 1 until 1_000_000)
        nextPermutation(arr)
    return arr.joinToString("")
}