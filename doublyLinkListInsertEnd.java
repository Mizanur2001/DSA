public class doublyLinkListInsertEnd {
    private class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    public ListNode head;
    public ListNode tail;

    public void displayForeword() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackword() {
        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " <-- ");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    public void insertEnd(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
    }

    public static void main(String[] args) {
        doublyLinkListInsertEnd dllie = new doublyLinkListInsertEnd();
        dllie.insertEnd(10);
        dllie.insertEnd(13);
        dllie.insertEnd(11);
        dllie.insertEnd(56);

        dllie.displayForeword();
        dllie.displayBackword();
    }
}
