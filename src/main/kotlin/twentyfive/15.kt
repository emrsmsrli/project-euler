// https://projecteuler.net/problem=15

package twentyfive

import util.fact

fun combination(n: Int, r: Int) = n.fact() / (r.fact() * (n - r).fact())

fun latticePathCount(m: Int, n: Int) = combination(m + n, n)