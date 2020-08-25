package top.auzqy._0001_0050._0026;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Solution_0026Test {

    static Stream<Arguments> intExpectedRes_StringExpectedArr_intArrInput() {
        return Stream.of(
                Arguments.of(2,"1 2 ",new int[]{1,1,2}),
                Arguments.of(5,"0 1 2 3 4 ",new int[]{0,0,1,1,1,2,2,3,3,4})
        );
    }

    @ParameterizedTest
    @MethodSource("intExpectedRes_StringExpectedArr_intArrInput")
    void removeDuplicates(int expectedRes, String expectedStr, int[] input) {
        Solution_0026 solution_0026 = new Solution_0026();
        Assertions.assertEquals(expectedRes,solution_0026.removeDuplicates(input));
        Assertions.assertEquals(expectedStr,resultStr(expectedRes,input));
    }

    private String resultStr(int expectedRes, int[] input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < expectedRes; i++) {
            sb.append(input[i]).append(" ");
        }
        return sb.toString();
    }
}