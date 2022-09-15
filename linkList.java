public class linkList {

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    private ListNode head;

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkList ll = new linkList();
        ll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode forth = new ListNode(11);

        ll.head.next = second;
        second.next = third;
        third.next = forth;

        ll.display();
    }
}