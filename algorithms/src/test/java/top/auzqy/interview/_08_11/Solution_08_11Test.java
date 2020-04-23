package top.auzqy.interview._08_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Solution_08_11Test {

    static Stream<Arguments> expectedInt_inputN() {
        return Stream.of(
                Arguments.of(2,5),
                Arguments.of(2,6),
                Arguments.of(4,10)
        );
    }

    @ParameterizedTest
    @MethodSource("expectedInt_inputN")
    void should_(int expectedInt, int n) {
        Solution_08_11 solution_08_11 = new Solution_08_11();
        assertEquals(expectedInt, solution_08_11.waysToChange(n));
    }

}