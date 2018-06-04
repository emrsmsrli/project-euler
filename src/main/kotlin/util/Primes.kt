package util

class Primes {
    private val primes = mutableListOf(2, 3, 5, 7)

    operator fun get(i: Int): Int {
        while(primes.size <= i)
            nextPrime()
        return primes[i]
    }

    fun take(n: Int): List<Int> {
        while(primes.size <= n)
            nextPrime()
        return primes.slice(0 until n)
    }

    fun takeUntil(n: Int): List<Int> {
        while(primes.last() < n)
            nextPrime()
        return primes.filter { it < n }
    }

    private fun nextPrime() {
        var next = primes.last()
        outer@ while(true) {
            next++
            if(next % 2 == 0 || next % 3 == 0)
                continue

            var i = 5
            while(i.pow(2) <= next) {
                if(next % i == 0 || next % (i + 2) == 0)
                    continue@outer
                i += 6
            }
            primes.add(next)
            break
        }
    }

    companion object {
        fun take(n: Int) = Primes().take(n)
        fun takeUntil(n: Int) = Primes().takeUntil(n)
    }
}