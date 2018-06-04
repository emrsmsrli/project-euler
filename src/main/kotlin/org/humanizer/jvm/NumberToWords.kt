package org.humanizer.jvm;

import java.util.ArrayList

class NumberToWords {
    fun toWords(value: Long): String {
        var number = value
        if (number == 0L)
            return "zero"

        if (number < 0)
            return "minus ${toWords((number * -1))}"

        val parts = ArrayList<String>()

        if ((number / 1000000000) > 0) {
            parts.add("${toWords((number / 1000000000))} billion")
            number %= 1000000000
        }

        if ((number / 1000000) > 0) {
            parts.add("${toWords((number / 1000000))} million")
            number %= 1000000
        }

        if ((number / 1000) > 0) {
            parts.add("${toWords((number / 1000))} thousand")
            number %= 1000
        }

        if ((number / 100) > 0) {
            parts.add("${toWords(number / 100)} hundred")
            number %= 100
        }

        if (number > 0) {
            if (parts.count() != 0)
                parts.add("and")

            if (number < 20)
                parts.add(unitsMap()[number.toInt()])
            else {
                var lastPart = tensMap()[number.toInt() / 10]
                if ((number % 10) > 0)
                    lastPart += "-${unitsMap()[number.toInt() % 10]}"

                parts.add(lastPart)
            }
        }

        return parts.joinToString(" ").trimStart()
    }

    private fun unitsMap(): List<String> {
        return listOf ("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen")
    }

    private fun tensMap(): List<String> {
        return listOf("zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety")
    }
}