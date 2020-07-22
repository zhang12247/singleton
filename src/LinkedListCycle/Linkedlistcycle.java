package LinkedListCycle;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Linkedlistcycle {
    public boolean hasCycle(ListNode head) {
        if(head ==null || head.next == null){
            return false;
        }
        ListNode slowNode = head.next;
        ListNode fastNode = head.next.next;
        while (slowNode != null && fastNode != null) {
            if (slowNode != fastNode) {
                slowNode = slowNode.next;
                if(fastNode.next == null){
                    return false;
                }
                fastNode = fastNode.next.next;
            } else {
                return true;
            }
        }
        return false;
    }
}
