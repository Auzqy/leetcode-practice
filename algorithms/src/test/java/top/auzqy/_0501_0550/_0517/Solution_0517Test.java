package top.auzqy._0501_0550._0517;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Solution_0517Test {

    static Stream<Arguments> intExpected_intArrInput() {
        return Stream.of(
                Arguments.of(-1,new int[]{0,2,0}),
                Arguments.of(3,new int[]{1,0,5}),
                Arguments.of(8,new int[]{0,0,11,5}),
                Arguments.of(2,new int[]{0,3,0})
        );
    }

    @ParameterizedTest
    @MethodSource("intExpected_intArrInput")
    void findMinMoves(int expected, int[] input) {
        Solution_0517 solution_0517 = new Solution_0517();
        Assertions.assertEquals(expected, solution_0517.findMinMoves(input));
    }
}