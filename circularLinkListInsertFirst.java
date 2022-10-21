public class circularLinkListInsertFirst {
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
        if (last == null) {
            return;
        }
        ListNode temp = last.next;
        while (temp != last) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        if (last == null) {
            last = newNode;
        } else {
            newNode.next = last.next;
        }
        last.next = newNode;
    }

    public static void main(String[] args) {
        circularLinkListInsertFirst cllif = new circularLinkListInsertFirst();
        // ListNode fListNode = new ListNode(1);
        // ListNode sListNode = new ListNode(10);
        // ListNode tListNode = new ListNode(15);
        // ListNode lListNode = new ListNode(25);

        // fListNode.next = sListNode;
        // sListNode.next = tListNode;
        // tListNode.next = lListNode;
        // lListNode.next = fListNode;
        // cllif.last = lListNode;

        // cllif.display();
        cllif.insertFirst(100);
        cllif.insertFirst(200);
        cllif.insertFirst(300);
        cllif.display();
    }
}