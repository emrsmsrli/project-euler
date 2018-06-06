// https://projecteuler.net/problem=22

package twentyfive

fun calculateNameScores(names: List<String>): Int {
    return names.sorted().map { it.codePoints().map { it - 64 }.sum() }
            .reduceIndexed { index, acc, i -> acc + (index + 1) * i }
}