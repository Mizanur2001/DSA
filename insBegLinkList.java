public class insBegLinkList {
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private ListNode head;

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
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
        insBegLinkList ibll = new insBegLinkList();
        ibll.insertFirst(11);
        ibll.insertFirst(8);
        ibll.insertFirst(1);
        ibll.display();
    }
}
