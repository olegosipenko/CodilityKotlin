package lesson02

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class OddOccurencesInArrayTest {
    @DisplayName("For array")
    @ParameterizedTest(name = "{0} unpaired element is {1}")
    @MethodSource("arrayProvider")
    fun testSolution(input: IntArray, unpairedElement: Int) {
        assertThat(OddOccurencesInArray.solution(input)).isEqualTo(unpairedElement)
    }

    companion object {
        @JvmStatic
        fun arrayProvider(): Stream<Arguments> = Stream.of(
            arguments(IN_01, OUT_01)
        )
    }
}

private val IN_01 = intArrayOf(9, 3, 9, 3, 9, 7, 9)
private const val OUT_01 = 7