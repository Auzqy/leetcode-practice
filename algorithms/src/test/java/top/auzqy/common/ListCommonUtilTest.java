package top.auzqy.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import top.auzqy._0001_0050._0021.ListNode;

import java.util.stream.Stream;

class ListCommonUtilTest {

    private static ListCommonUtil listCommonUtil = new ListCommonUtil();

    static Stream<Arguments> expectedBoolean_inputListNode1_inputListNode2() {
        return Stream.of(
                Arguments.of(true,new int[]{1,2,3},new int[]{1,2,3}),
                Arguments.of(false,new int[]{1,2,3},new int[]{1,2,3,4}),
                Arguments.of(false,new int[]{1,2,3,4},new int[]{1,2,3}),
                Arguments.of(true,null,null),
                Arguments.of(false,null,new int[]{1,2,3,4}),
                Arguments.of(false,new int[]{1,2,3,4},null),
                Arguments.of(false,new int[]{},new int[]{1,2,3,4}),
                Arguments.of(false,new int[]{1,2,3,4},new int[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("expectedBoolean_inputListNode1_inputListNode2")
    void compare_2_listNode(boolean expectedBoolean, int[] inputArr1,int[] inputArr2) {
        ListNode listNode1 = listCommonUtil.buildListNode(inputArr1);
        ListNode listNode2 = listCommonUtil.buildListNode(inputArr2);
        Assertions.assertEquals(expectedBoolean,
                listCommonUtil.compare(listNode1,listNode2));
    }

    static Stream<Arguments> expectedStr_inputIntArr() {
        return Stream.of(
                Arguments.of("1 2 3",new int[]{1,2,3}),
                Arguments.of(null,null)
        );
    }

    @ParameterizedTest
    @MethodSource("expectedStr_inputIntArr")
    void build_print(String expected, int[] inputArr) {
        ListNode listNode = listCommonUtil.buildListNode(inputArr);
        Assertions.assertEquals(expected, listCommonUtil.printListNode(listNode));
    }
}