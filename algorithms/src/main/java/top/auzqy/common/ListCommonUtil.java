package top.auzqy.common;

import top.auzqy._0001_0050._0021.ListNode;

public class ListCommonUtil {

    public boolean compare(ListNode listNode1, ListNode listNode2) {

        if (listNode1 == null && listNode2 == null) {
            return true;
        }
        if (listNode1 == null || listNode2 == null) {
            return false;
        }
        // 两者均不为 null
        while (listNode1 != null && listNode2 != null) {
            if (listNode1.val != listNode2.val) {
                return false;
            }
            listNode2 = listNode2.next;
            listNode1 = listNode1.next;
        }
        return listNode1 == null && listNode2 == null;
    }

    public ListNode buildListNode(int[] listNodeValue) {
        if (listNodeValue == null) {
            return null;
        }
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        for (int value : listNodeValue) {
            curr.next = new ListNode(value);
            curr = curr.next;
        }
        return dummyHead.next;
    }

    public String printListNode(ListNode listNode) {
        if (listNode == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        while (listNode != null) {
            sb.append(listNode.val).append(" ");
            listNode = listNode.next;
        }
        return sb.toString().substring(0,sb.toString().length()-1);
    }
}
