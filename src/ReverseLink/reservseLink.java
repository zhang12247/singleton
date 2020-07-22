package ReverseLink;

class ListNode {
    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }

    ListNode(int x, ListNode y) {
        val = x;
        next = y;
    }
}

class ReverseLink {
    public static ListNode reverseList(ListNode head) {
        ListNode lastNode = null;
        ListNode currentNode = head;
        while (currentNode != null) {
            ListNode tempNode = currentNode;
            currentNode = currentNode.next;
            tempNode.next = lastNode;
            lastNode = tempNode;
        }
        return lastNode;
    }

    public static void main(String[] args) {
        ListNode l2 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        reverseList(l2);
    }
}
