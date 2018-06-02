package util

fun Int.isEven(): Boolean {
    return this % 2 == 0
}

fun Long.isEven(): Boolean {
    return this % 2L == 0L
}

fun Long.sqrt(): Long {
    var y: Long = 0
    var i = 1L shl 31
    while(i != 0L) {
        y = y or i
        if(y > 3037000499L || y * y > this)
            y = y xor i
        i = i ushr 1
    }
    return y
}