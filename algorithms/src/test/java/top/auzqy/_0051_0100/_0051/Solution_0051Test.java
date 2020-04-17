package top.auzqy._0051_0100._0051;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Solution_0051Test {
    
    static Stream<Arguments> expectedBoolean_inputIntArr() {
        return Stream.of(
                Arguments.of(true,new int[]{2,3,1,1,4}),
                Arguments.of(false,new int[]{3,2,1,0,4}),
                Arguments.of(true,new int[]{3,3,0,0,4}),
                Arguments.of(true,new int[]{0}),
                Arguments.of(false,new int[]{0,0}),
                Arguments.of(false,new int[]{0,2,3})
        );
    }
    
    @ParameterizedTest
    @MethodSource("expectedBoolean_inputIntArr")
    void should_(boolean expected, int[] inputArr) {
        Solution_0051 solution0051 = new Solution_0051();
        assertEquals(expected, solution0051.canJump(inputArr));
    }

}