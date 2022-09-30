public class findStartNodeOfLoop {
    private static class ListNode {
        private int data;
        private ListNode next;

        private ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode head;

    public void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public ListNode FirstNodeOfLoop() {
        ListNode slowPtr = head;
        ListNode firstPtr = head;
        while (firstPtr != null && firstPtr.next != null) {
            firstPtr = firstPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == firstPtr) {
                return findFirstNode(slowPtr);
            }
        }
        return null;
    }

    private ListNode findFirstNode(ListNode slowPtr) {
        ListNode temp = head;
        while (slowPtr != temp) {
            slowPtr = slowPtr.next;
            temp = temp.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        findStartNodeOfLoop fsnol = new findStartNodeOfLoop();
        fsnol.head = new ListNode(1);
        ListNode firstNode = new ListNode(2);
        ListNode secondNode = new ListNode(3);
        ListNode thirdNode = new ListNode(4);
        ListNode forthNode = new ListNode(5);
        fsnol.head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = fsnol.head;

        if (fsnol.FirstNodeOfLoop()!=null) {
            System.out.println(fsnol.FirstNodeOfLoop().data);
        }
        else{
            System.out.println(fsnol.FirstNodeOfLoop());
        }
        
    }
}
