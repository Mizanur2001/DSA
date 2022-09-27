public class middleNode {
    private static class ListNode {
        private int data;
        private ListNode next;

        private ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode head;

    public void dispaly() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public ListNode MiddleNode() {
        if (head == null) {
            return null;
        }
        ListNode slowPtr = head;
        ListNode firstPtr = head;

        while (firstPtr != null && firstPtr.next != null) {
            slowPtr = slowPtr.next;
            firstPtr = firstPtr.next.next;
        }
        return slowPtr;
    }

    public static void main(String[] args) {
        middleNode mn = new middleNode();
        mn.head = new ListNode(10);
        ListNode firstNode = new ListNode(15);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(12);
        ListNode forthNode = new ListNode(10);

        mn.head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;

        mn.dispaly();
        System.out.println("middle node is -> " + mn.MiddleNode().data);
    }
}