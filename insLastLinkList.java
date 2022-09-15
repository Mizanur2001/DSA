public class insLastLinkList {
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    private ListNode head;

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        insLastLinkList illl = new insLastLinkList();
        illl.insertLast(11);
        illl.insertLast(8);
        illl.insertLast(1);
        illl.display();
    }
}
