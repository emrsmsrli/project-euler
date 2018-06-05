package org.humanizer.jvm

fun Int.toWords(): String {
    return this.toLong().toWords()
}

fun Long.toWords(): String {
    return NumberToWords.toWords(this)
}