package RemoveNodeOfList;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
    ListNode(int x,ListNode y) {
        val = x;
        next = y;
    }
}

public class Removenode {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return head.next;
        }
        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        int count = -1;
        ListNode head2 = preHead;
        while (head != null) {
            head = head.next;
            count += 1;
            if (count >= n) {
                head2 = head2.next;
            }
        }
//        if(preHead.next == head2){
//            return preHead.next.next;
//        }
//        if(head2.next == null){
//            head2 = null;
//            return preHead.next;
//        }
        head2.next = head2.next.next;
        return preHead.next;
    }

    public static void main(String[] args) {
//        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
//        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
//        ListNode l1 = null;
//        ListNode l2 = new ListNode(0,null);
        ListNode l1 = new ListNode(5, null);
        ListNode l2 = new ListNode(1, new ListNode(2, null));
        ListNode l3 = new ListNode(1, new ListNode(2, new ListNode(3,new ListNode(4,new ListNode(5,null)))));
        removeNthFromEnd(l3,2);
    }
}
