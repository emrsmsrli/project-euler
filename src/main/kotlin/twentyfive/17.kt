// https://projecteuler.net/problem=17

package twentyfive

import org.humanizer.jvm.toWords

fun countLetters(upTo: Int): Int {
    fun String.strip() = this.replace(" ", "").replace("-", "")

    val sb = StringBuilder(256)
    for(i in 1..upTo)
        sb.append(i.toWords().strip())
    return sb.length
}