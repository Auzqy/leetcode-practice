package top.auzqy._0151_0200._0152;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_0152Test {

    static Stream<Arguments> intExpected_intArrInput() {
        return Stream.of(
                Arguments.of(6,new int[]{2,3,-2,4}),
                Arguments.of(0,new int[]{-2,0,-1})
        );
    }

    @ParameterizedTest
    @MethodSource("intExpected_intArrInput")
    void maxProduct(int expected, int[] input) {
        Solution_0152 solution_0152 = new Solution_0152();
        assertEquals(expected, solution_0152.maxProduct(input));
    }
}