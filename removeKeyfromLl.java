public class removeKeyfromLl {
    private static class ListNode {
        private int data;
        private ListNode next;

        private ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode head;

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteKey(int key) {
        ListNode current = head;
        ListNode temp = null;
        if (current.data == key) {
            head = current.next;
            return;
        }
        while (current != null && current.data != key) {
            temp = current;
            current = current.next;
        }

        if (current == null) {
            return;
        }

        temp.next = current.next;
    }

    public static void main(String[] args) {
        removeKeyfromLl rkl = new removeKeyfromLl();
        rkl.head = new ListNode(10);
        ListNode firstNode = new ListNode(12);
        ListNode secondNode = new ListNode(14);
        ListNode ThirdNode = new ListNode(18);
        ListNode frothNode = new ListNode(19);
        rkl.head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = ThirdNode;
        ThirdNode.next = frothNode;

        rkl.display();
        rkl.deleteKey(14);
        rkl.display();
    }
}
