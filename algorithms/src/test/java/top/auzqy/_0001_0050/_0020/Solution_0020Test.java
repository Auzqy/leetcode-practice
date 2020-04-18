package top.auzqy._0001_0050._0020;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Solution_0020Test {

    static Stream<Arguments> expectedBoolean_inputStr() {
        return Stream.of(
                Arguments.of(true,"()"),
                Arguments.of(true,"()[]{}"),
                Arguments.of(false,"(]"),
                Arguments.of(false,"([)]"),
                Arguments.of(true,"{[]}")
        );
    }

    @ParameterizedTest
    @MethodSource("expectedBoolean_inputStr")
    void should_(boolean expectedBoolean, String inputStr) {
        Solution_0020 solution_0020 = new Solution_0020();
        Assertions.assertEquals(expectedBoolean,solution_0020.isValid(inputStr));
    }
}