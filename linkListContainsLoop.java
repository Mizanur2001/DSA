public class linkListContainsLoop {
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

    public boolean contaisLoop() {
        ListNode slowPtr = head;
        ListNode firtPtr = head;

        while (firtPtr != null && firtPtr.next != null) {
            firtPtr = firtPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == firtPtr) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        linkListContainsLoop llcl = new linkListContainsLoop();
        llcl.head = new ListNode(10);
        ListNode firstNode = new ListNode(12);
        ListNode secondNode = new ListNode(14);
        ListNode ThirdNode = new ListNode(18);
        ListNode forthNode = new ListNode(19);
        llcl.head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = ThirdNode;
        ThirdNode.next = forthNode;
        forthNode.next = secondNode;

        System.out.println(llcl.contaisLoop());
    }
}
