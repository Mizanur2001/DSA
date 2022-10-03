public class mergeLinkList {
    private static class ListNode {
        private int data;
        private ListNode next;

        private ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode head1;
    public ListNode head2;
    public ListNode head3;

    public void display(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " --> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public ListNode merge(ListNode a, ListNode b) {
        ListNode dummyNode = new ListNode(0);
        ListNode tail = dummyNode;
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a == null) {
            tail.next = b;
        } else {
            tail.next = a;
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        mergeLinkList mll = new mergeLinkList();

        // first Link List
        mll.head1 = new ListNode(1);
        ListNode l1n1 = new ListNode(6);
        ListNode l1n2 = new ListNode(9);
        ListNode l1n3 = new ListNode(12);
        mll.head1.next = l1n1;
        l1n1.next = l1n2;
        l1n2.next = l1n3;

        mll.display(mll.head1);

        // Second Link List
        mll.head2 = new ListNode(2);
        ListNode f2n1 = new ListNode(8);
        ListNode f2n2 = new ListNode(10);
        ListNode f2n3 = new ListNode(13);
        ListNode f2n4 = new ListNode(15);
        ListNode f2n5 = new ListNode(19);
        mll.head2.next = f2n1;
        f2n1.next = f2n2;
        f2n2.next = f2n3;
        f2n3.next = f2n4;
        f2n4.next = f2n5;

        mll.display(mll.head2);

        // merge this two Link List
        mll.head3 = mll.merge(mll.head1, mll.head2);
        mll.display(mll.head3);
    }
}
