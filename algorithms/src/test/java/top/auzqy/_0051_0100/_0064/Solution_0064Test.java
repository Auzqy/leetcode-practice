package top.auzqy._0051_0100._0064;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_0064Test {

    static Stream<Arguments> intExpected_int2DArrInput() {
        return Stream.of(
                Arguments.of(7, new int[][]{
                        {1,3,1},
                        {1,5,1},
                        {4,2,1}})
        );
    }

    @ParameterizedTest
    @MethodSource("intExpected_int2DArrInput")
    void minPathSum(int expected, int[][] input) {
        Solution_0064 solution_0064 = new Solution_0064();
        assertEquals(expected, solution_0064.minPathSum(input));
    }
}