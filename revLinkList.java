public class revLinkList {
    private static class ListNode {
        private int data;
        private ListNode next;

        private ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode head;

    public void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public ListNode revarceNode() {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        ListNode Next = null;
        ListNode previous = null;
        while (current != null) {
            Next = current.next;
            current.next = previous;
            previous = current;
            current = Next;
        }
        return previous;
    }

    public static void main(String[] args) {
        revLinkList rll = new revLinkList();
        rll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode forth = new ListNode(11);

        rll.head.next = second;
        second.next = third;
        third.next = forth;

        rll.display(rll.head);
        ListNode revListHead = rll.revarceNode();
        rll.display(revListHead);
    }
}
