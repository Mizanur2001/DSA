public class delBegLinkList {
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
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

    public ListNode DeleteBeg() {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        head = head.next;
        current.next = null;
        return current;
    }

    public static void main(String[] args) {
        delBegLinkList dbll = new delBegLinkList();
        dbll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode forth = new ListNode(11);

        dbll.head.next = second;
        second.next = third;
        third.next = forth;
        dbll.display();
        System.out.println(dbll.DeleteBeg().data);
        System.out.println(dbll.DeleteBeg().data);
        System.out.println(dbll.DeleteBeg().data);
        System.out.println(dbll.DeleteBeg().data);
        dbll.display();

    }
}
