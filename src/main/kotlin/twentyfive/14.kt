// https://projecteuler.net/problem=14

package twentyfive

fun longestCollatzSequenceStarter(until: Int = 1_000_000): Int {
    val cache = IntArray(until) { -1 }
    cache[1] = 1
    var seqLength = 0
    var startingNumber = 0
    var sequence: Long

    for(i in 2 until until) {
        sequence = i.toLong()
        var k = 0
        while(sequence != 1L && sequence >= i) {
            k++
            if(sequence % 2 == 0L)  sequence /= 2
            else                    sequence = sequence * 3 + 1
        }
        cache[i] = k + cache[sequence.toInt()]

        if(cache[i] > seqLength) {
            seqLength = cache[i]
            startingNumber = i
        }
    }

    return startingNumber
}