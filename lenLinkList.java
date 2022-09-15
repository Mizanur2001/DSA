public class lenLinkList {

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private ListNode head;

    public int length() {
        int count = 0;
        if (head == null) {
            return 0;
        }
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        lenLinkList ls = new lenLinkList();
        ls.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode forth = new ListNode(10);

        ls.head.next = second;
        second.next = third;
        third.next = forth;

        System.out.println("Length is -> " + ls.length());
    }
}
