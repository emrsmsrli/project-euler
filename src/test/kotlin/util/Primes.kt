package util

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class TPrimes {
    private lateinit var primes: Primes

    @Before fun init() {
        primes = Primes()
    }

    @Test fun testGet() {
        Assert.assertEquals(2, primes[0])
        Assert.assertEquals(3, primes[1])
        Assert.assertEquals(5, primes[2])

        Assert.assertEquals(11, primes[4])
        Assert.assertEquals(13, primes[5])
    }

    @Test fun testTake() {
        Assert.assertEquals("2, 3, 5, 7", primes.take(4).joinToString())
        Assert.assertEquals("2, 3, 5, 7, 11, 13", primes.take(6).joinToString())
    }

    @Test fun testTakeUntil() {
        Assert.assertNotEquals("2, 3, 5, 7", primes.takeUntil(7).joinToString())
        Assert.assertEquals("2, 3, 5, 7", primes.takeUntil(8).joinToString())
        Assert.assertNotEquals("2, 3, 5, 7, 11, 13", primes.takeUntil(13).joinToString())
        Assert.assertEquals("2, 3, 5, 7, 11, 13", primes.takeUntil(14).joinToString())
    }
}