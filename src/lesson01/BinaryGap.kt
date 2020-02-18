package lesson01

import java.util.regex.Pattern

object BinaryGap {
    fun solution(n: Int): Int {
        if (n < 1) {
            return 0
        }
        return getLongestGap(n)
    }

    private fun getLongestGap(n: Int): Int {
        val binaryString = Integer.toBinaryString(n)
        val startIndex = binaryString.indexOfFirst { ch -> ch == '1' }
        val endIndex = binaryString.indexOfLast { ch -> ch == '1' }
        val strippedString = binaryString.substring(startIndex, endIndex)
        return strippedString.split(regex = pattern).map { it.length }.max() ?: 0
    }

    private val pattern = Pattern.compile("1+")
}