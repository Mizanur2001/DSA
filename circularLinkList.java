public class circularLinkList {
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode last;

    public void display() {
        ListNode temp = last.next;
        while (temp != last) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        circularLinkList cll = new circularLinkList();
        ListNode fListNode = new ListNode(1);
        ListNode sListNode = new ListNode(10);
        ListNode tListNode = new ListNode(15);
        ListNode lListNode = new ListNode(25);

        fListNode.next = sListNode;
        sListNode.next = tListNode;
        tListNode.next = lListNode;
        lListNode.next = fListNode;
        cll.last = lListNode;

        cll.display();
    }
}