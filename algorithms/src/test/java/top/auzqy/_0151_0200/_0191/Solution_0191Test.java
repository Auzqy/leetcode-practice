package top.auzqy._0151_0200._0191;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Solution_0191Test {

    static Stream<Arguments> intExpected_intInput() {
        return Stream.of(
                Arguments.of(2,12),
                Arguments.of(1,1),
                Arguments.of(2,3),
                Arguments.of(0,0)
        );
    }

    @ParameterizedTest
    @MethodSource("intExpected_intInput")
    void hammingWeight(int expected, int input) {
        Solution_0191 solution_0191 = new Solution_0191();
        assertEquals(expected, solution_0191.hammingWeight(input));
    }
}