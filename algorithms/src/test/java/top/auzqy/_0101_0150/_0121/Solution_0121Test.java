package top.auzqy._0101_0150._0121;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Solution_0121Test {

    static Stream<Arguments> intExpected_intArrInput() {
        return Stream.of(
                Arguments.of(7, new int[]{9, 3, 7, 5, 1, 8}),
                Arguments.of(0, new int[]{8}),
                Arguments.of(0, new int[]{9, 8}),
                Arguments.of(0, new int[]{9, 8, 7, 6})
        );
    }

    @ParameterizedTest
    @MethodSource("intExpected_intArrInput")
    void maxProfit(int expected, int[] input) {
        Solution_0121 solution_0121 = new Solution_0121();
        assertEquals(expected, solution_0121.maxProfit(input));
    }
}