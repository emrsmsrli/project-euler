package util

fun Int.isEven(): Boolean {
    return this % 2 == 0
}

fun Int.pow(n: Int): Int {
    var sum = 1
    for(i in 1..n)
        sum *= this
    return sum
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

fun primes(n: Int): List<Int> {
    val primes = BooleanArray(n + 1)
    for(i in 2 until primes.size)
        primes[i] = true
    var num = 2
    while(true) {
        var k = 2
        while(true) {
            val multiple = num * k
            if(multiple > n) break
            else primes[multiple] = false
            k++
        }
        var nextNumFound = false
        for(i in num + 1 until n + 1) {
            if(primes[i]) {
                num = i
                nextNumFound = true
                break
            }
        }
        if(!nextNumFound)
            break
    }

    return primes.indices.filter { primes[it] }
}