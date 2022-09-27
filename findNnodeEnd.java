public class findNnodeEnd {
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
        ListNode ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " --> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    public ListNode findNNodeEnd(int n) {
        if (head == null) {
            return null;
        }

        if (n < 0) {
            System.out.println("Invalid value of n= " + n);
            return null;
        }

        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;

        while (count < n) {
            if (refPtr == null) {
                System.out.println(n + " is greter than link List ");
                return null;
            }
            refPtr = refPtr.next;
            count++;
        }

        while (refPtr != null) {
            mainPtr = mainPtr.next;
            refPtr = refPtr.next;
        }
        return mainPtr;
    }

    public static void main(String[] args) {
        findNnodeEnd fnne = new findNnodeEnd();
        fnne.head = new ListNode(10);
        ListNode firListNode = new ListNode(2);
        ListNode secondListNode = new ListNode(21);
        ListNode thirdListNode = new ListNode(13);

        fnne.head.next = firListNode;
        firListNode.next = secondListNode;
        secondListNode.next = thirdListNode;

        fnne.display();
        System.out.println("nth node from end of a Singly Linked List is = " + fnne.findNNodeEnd(3).data);
    }
}
