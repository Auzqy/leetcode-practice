package top.auzqy._0401_0450._0423;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Solution_0423Test {
    
    static Stream<Arguments> stringExpected_stringInput() {
        return Stream.of(
                Arguments.of("012","owoztneoer"),
                Arguments.of("45","fviefuro")
        );
    }
    
    @ParameterizedTest
    @MethodSource("stringExpected_stringInput")
    void should_(String expected, String input) {
        Solution_0423 solution0423 = new Solution_0423();
        assertEquals(expected,solution0423.originalDigits(input));
    }

    @Test
    void originalDigits() {
    }
}