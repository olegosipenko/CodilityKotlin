package lesson02

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.*
import java.util.stream.Stream

internal class CyclicRotationTest {
    @DisplayName("Rotating")
    @ParameterizedTest(name = "{0} {1} times should result in {2}")
    @MethodSource("testArgumentsSource")
    fun testSolution(input: IntArray, k: Int, output: IntArray) {
        assertThat(CyclicRotation.solution(input, k)).isEqualTo(output)
    }
    companion object {
        @JvmStatic
        fun testArgumentsSource(): Stream<Arguments> = Stream.of(
            arguments(IN_01, K_01, OUT_01),
            arguments(IN_02, K_02, OUT_02),
            arguments(IN_03, K_03, OUT_03),
            arguments(IN_04, K_04, OUT_04)
        )
    }
}

private val IN_01 = intArrayOf(3, 8, 9, 7, 6)
private const val K_01 = 1
private val OUT_01 = intArrayOf(6, 3, 8, 9, 7)

private val IN_02 = intArrayOf(3, 8, 9, 7, 6)
private const val K_02 = 3
private val OUT_02 = intArrayOf(9, 7, 6, 3, 8)

private val IN_03 = intArrayOf(0, 0, 0)
private const val K_03 = 1
private val OUT_03 = intArrayOf(0, 0, 0)

private val IN_04 = intArrayOf(1, 2, 3, 4)
private const val K_04 = 4
private val OUT_04 = intArrayOf(1, 2, 3, 4)