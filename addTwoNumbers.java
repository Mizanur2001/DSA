public class addTwoNumbers {
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

    public ListNode add(ListNode a, ListNode b) {
        ListNode dummyNode = new ListNode(0);
        ListNode tail = dummyNode;
        int carry = 0;
        while (a != null || b != null) {
            int x = a == null ? 0 : a.data;
            int y = b == null ? 0 : b.data;
            int sum = x + y + carry;
            carry = sum / 10;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            if (a != null) {
                a = a.next;
            }
            if (b != null) {
                b = b.next;
            }
        }

        if (carry > 0) {
            tail.next = new ListNode(carry);
        }

        return dummyNode.next;
    }

    public static void main(String[] args) {
        addTwoNumbers atn = new addTwoNumbers();

        // List 1
        atn.head1 = new ListNode(7);
        ListNode l1n1 = new ListNode(4);
        ListNode l1n2 = new ListNode(9);
        atn.head1.next = l1n1;
        l1n1.next = l1n2;

        atn.display(atn.head1);

        // Lins 2
        atn.head2 = new ListNode(5);
        ListNode l2n1 = new ListNode(6);
        atn.head2.next = l2n1;

        atn.display(atn.head2);

        // Add this two Link List and store the sum in another new Link List
        atn.head3 = atn.add(atn.head1, atn.head2);
        atn.display(atn.head3);
    }
}
