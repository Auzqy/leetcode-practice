package top.auzqy.common;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ListCommonTest {

    static Stream<Arguments> expectedBoolean_inputListNode1_inputListNode2() {
        return Stream.of(
                Arguments.of(true),
                Arguments.of()
        );
    }

    @ParameterizedTest
    @MethodSource("expectedBoolean_inputListNode1_inputListNode2")
    void should_() {

    }

}