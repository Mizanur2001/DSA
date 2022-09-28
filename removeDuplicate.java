public class removeDuplicate {
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

    public void RemoveDuplicate() {
        if (head == null) {
            return;
        }

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        removeDuplicate rd = new removeDuplicate();
        rd.head = new ListNode(1);
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode ThirdNode = new ListNode(3);
        ListNode frothNode = new ListNode(3);
        rd.head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = ThirdNode;
        ThirdNode.next = frothNode;

        rd.display();
        rd.RemoveDuplicate();
        rd.display();
    }
}