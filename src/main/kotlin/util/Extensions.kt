package util

import java.math.BigInteger

fun Int.isEven(): Boolean {
    return this % 2 == 0
}

fun Int.pow(n: Int): Int {
    var sum = 1
    for(i in 1..n)
        sum *= this
    return sum
}

fun Int.sumOfEvenDivisors(): Int {
    var sum = 0
    for(i in 1..(this / 2)) {
        if(this % i == 0)
            sum += i
    }
    return sum
}

fun Int.sumOfDivisors() = sumOfEvenDivisors() + this

fun Int.isLeapYear() = this % 4 == 0 || this % 400 == 0

fun Int.fact(): BigInteger {
    if(this == 0 || this == 1)
        return BigInteger.ONE

    return BigInteger.valueOf(this.toLong()) * (this - 1).fact()
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

fun String.isPalindrome(): Boolean {
    val l = this.length
    for(k in 0 until l / 2)
        if(this[k] != this[l - k - 1])
            return false
    return true
}