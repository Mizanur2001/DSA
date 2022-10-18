public class doublyLinkList {
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

    public void insertValue(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
    }

    public void dispalyForeword() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void dispalyBackword() {
        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        doublyLinkList dll = new doublyLinkList();
        dll.insertValue(0);
        dll.insertValue(10);
        dll.insertValue(20);
        dll.insertValue(30);

        dll.dispalyForeword();
        dll.dispalyBackword();
    }
}
