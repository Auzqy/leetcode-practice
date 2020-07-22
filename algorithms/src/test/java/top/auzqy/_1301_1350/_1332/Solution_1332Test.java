package top.auzqy._1301_1350._1332;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_1332Test {

    static Stream<Arguments> intExpected_stringInput() {
        return Stream.of(
                Arguments.of(1,"ababa"),
                Arguments.of(2,"abb"),
                Arguments.of(2,"baabb")
        );
    }

    @ParameterizedTest
    @MethodSource("intExpected_stringInput")
    void removePalindromeSub(int expected, String input) {
        Solution_1332 solution_1332 = new Solution_1332();
        assertEquals(expected,solution_1332.removePalindromeSub(input));
    }
}