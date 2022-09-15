class insLinkList {
    private class ListNode {
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

    public void insert(int position, int value) {
        ListNode newNode = new ListNode(value);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            newNode.next = current;
            previous.next = newNode;
        }
    }

    public static void main(String[] args) {
        insLinkList ill = new insLinkList();
        ill.insert(1, 1);
        ill.insert(1, 2);
        ill.insert(2, 20);
        ill.insert(3, 30);
        ill.insert(5, 100);
        ill.display();
    }
}