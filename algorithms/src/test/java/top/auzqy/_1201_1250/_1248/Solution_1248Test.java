package top.auzqy._1201_1250._1248;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Solution_1248Test {

    static Stream<Arguments> expectedInt_inputIntArr_inputIntK() {
        return Stream.of(
                Arguments.of(2,new int[]{1,1,2,1,1},3),
                Arguments.of(0,new int[]{2,4,6},1),
                Arguments.of(16,new int[]{2,2,2,1,2,2,1,2,2,2},2)
        );
    }

    @ParameterizedTest
    @MethodSource("expectedInt_inputIntArr_inputIntK")
    void should_(int expectedInt, int[] arr, int k) {
        Solution_1248 solution_1248 = new Solution_1248();
        assertEquals(expectedInt, solution_1248.numberOfSubarrays(arr, k));
    }
}