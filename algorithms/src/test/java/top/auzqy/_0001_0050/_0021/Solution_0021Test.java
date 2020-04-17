package top.auzqy._0001_0050._0021;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import top.auzqy.common.ListCommonUtil;

import java.util.stream.Stream;

class Solution_0021Test {

    private ListCommonUtil listCommonUtil = new ListCommonUtil();
    
    static Stream<Arguments> expectedBoolean_expectedListNodeRest_inputListNode1_inputListNode2() {
        return Stream.of(
                Arguments.of(true,new int[]{1,1,2,3,4,4},new int[]{1,2,4},new int[]{1,3,4})
        );
    }
    
    @ParameterizedTest
    @MethodSource("expectedBoolean_expectedListNodeRest_inputListNode1_inputListNode2")
    void should_(boolean expectedBoolean,
                 int[] expectedListNodeRest,
                 int[] inputListNode1,
                 int[] inputListNode2) {
        ListNode listNodeRest = listCommonUtil.buildListNode(expectedListNodeRest);

        ListNode listNode1 = listCommonUtil.buildListNode(inputListNode1);
        ListNode listNode2 = listCommonUtil.buildListNode(inputListNode2);

        Solution_0021 solution0021 = new Solution_0021();
        ListNode listNode = solution0021.mergeTwoLists(listNode1, listNode2);

        Assertions.assertEquals(expectedBoolean,
                listCommonUtil.compare(listNodeRest,listNode));
    }

}