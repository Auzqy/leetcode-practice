package top.auzqy._0251_0300._0263;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Solution_0263Test {


    static Stream<Arguments> boolExpected_intInput() {
        return Stream.of(
                Arguments.of(true,1),
                Arguments.of(false,-1),
                Arguments.of(true,2),
                Arguments.of(true,3),
                Arguments.of(true,5),
                Arguments.of(true,10),
                Arguments.of(false,11),
                Arguments.of(false,0)
        );
    }

    @ParameterizedTest
    @MethodSource("boolExpected_intInput")
    void isUgly(boolean expected, int input) {
        Solution_0263 isUglyNumber = new Solution_0263();
        assertEquals(expected, isUglyNumber.isUgly(input));
    }

}