public class removeLoopFromLinkList {
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

    public void isLoop() {
        ListNode slowPtr = head;
        ListNode firstPtr = head;

        while (firstPtr != null && firstPtr.next != null) {
            firstPtr = firstPtr.next.next;
            slowPtr = slowPtr.next;

            if (slowPtr == firstPtr) {
                removeLoop(slowPtr);
                return;
            }

        }
        System.out.println("This Link List Does not contain any loop");
    }

    public void removeLoop(ListNode slowPtr) {
        ListNode temp = head;
        while (temp.next != slowPtr.next) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;
    }

    public static void main(String[] args) {
        removeLoopFromLinkList rlfll = new removeLoopFromLinkList();
        rlfll.head = new ListNode(1);
        ListNode firstNode = new ListNode(2);
        ListNode secondNode = new ListNode(3);
        ListNode thirdNode = new ListNode(4);
        ListNode forthNode = new ListNode(5);
        ListNode fifthNode = new ListNode(6);

        rlfll.head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = fifthNode;
        fifthNode.next = secondNode;

        rlfll.isLoop();
        rlfll.display();
    }
}
