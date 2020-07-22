package MergeTwoSortedLists;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Mergelists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if (l1 == null) {
//            return l2;
//        }
//        if (l2 == null) {
//            return l1;
//        }
        ListNode preHead = new ListNode(-1);

        ListNode pre = preHead;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                pre.next = l1;
                l1 = l1.next;
            } else {
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }

        if (l1 == null) {
            pre.next = l2;
        } else {
            pre.next = l1;
        }

        return preHead.next;

    }

    public static void main(String[] args) {
//        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
//        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
//        ListNode l1 = null;
//        ListNode l2 = new ListNode(0,null);
        ListNode l1 = new ListNode(5, null);
        ListNode l2 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        mergeTwoLists(l1, l2);
    }
}
