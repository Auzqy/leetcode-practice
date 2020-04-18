package top.auzqy._0001_0050._0011;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import top.auzqy._0001_0050._0021.Solution_0021;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Solution_0011Test {

    static Stream<Arguments> expectedMaxArea_inputIntArr() {
        return Stream.of(
                Arguments.of(49,new int[]{1,8,6,2,5,4,8,3,7}),
                Arguments.of(1,new int[]{1,1})
        );
    }

    @ParameterizedTest
    @MethodSource("expectedMaxArea_inputIntArr")
    void should_(int expectedMaxArea, int[] inputIntArr) {
        Solution_0011 solution_0011 = new Solution_0011();
        assertEquals(expectedMaxArea, solution_0011.maxArea(inputIntArr));
    }
}