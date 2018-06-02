// https://projecteuler.net/problem=1

package twentyfive

fun sumOfMultiplesOf3Or5Until1000(): Int {
    return sumOfMultiplesOf3Or5(1000)
}

fun sumOfMultiplesOf3Or5(end: Int): Int {
    return (1 until end).filter {
        it % 3 == 0 || it % 5 == 0
    }.sum()
}
