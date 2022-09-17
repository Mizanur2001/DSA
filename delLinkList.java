public class delLinkList {
    private static class ListNode {
        private int data;
        private ListNode next;

        private ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode head;

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void dellAny(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            int count = 1;
            ListNode previous = head;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    public static void main(String[] args) {
        delLinkList dll = new delLinkList();
        dll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode forth = new ListNode(11);

        dll.head.next = second;
        second.next = third;
        third.next = forth;

        dll.display();
        dll.dellAny(1);
        dll.display();
    }
}
