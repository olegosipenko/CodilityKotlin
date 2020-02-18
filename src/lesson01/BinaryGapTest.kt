package lesson01

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class BinaryGapTest {

    @DisplayName("Binary gap")
    @ParameterizedTest(name = " of {0} is equal to {1}")
    @MethodSource("testCasesProvider")
    fun testBinaryGap(input: Int, output: Int) {
        assertThat(BinaryGap.solution(input)).isEqualTo(output)
    }

    companion object {
        @JvmStatic
        fun testCasesProvider(): Stream<Arguments> = Stream.of(
            arguments(IN_1, OUT_1),
            arguments(IN_2, OUT_2),
            arguments(IN_3, OUT_3),
            arguments(IN_4, OUT_4),
            arguments(IN_5, OUT_5),
            arguments(IN_6, OUT_6),
            arguments(IN_7, OUT_7)
        )
    }
}

private const val IN_1 = 9
private const val OUT_1 = 2
private const val IN_2 = 529
private const val OUT_2 = 4
private const val IN_3 = 20
private const val OUT_3 = 1
private const val IN_4 = 15
private const val OUT_4 = 0
private const val IN_5 = -5
private const val OUT_5 = 0
private const val IN_6 = 1041
private const val OUT_6 = 5
private const val IN_7 = 32
private const val OUT_7 = 0