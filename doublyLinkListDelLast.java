import java.util.NoSuchElementException;

public class doublyLinkListDelLast {
    private static class ListNode {
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

    public ListNode delLast() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        ListNode temp = tail;
        if (tail == head) {
            head = null;
        } else {
            tail.previous.next = null;
        }
        tail = temp.previous;
        temp.previous = null;
        return temp;
    }

    public static void main(String[] args) {
        doublyLinkListDelLast dlldl = new doublyLinkListDelLast();
        ListNode fNode = new ListNode(10);
        ListNode sNode = new ListNode(20);
        ListNode tNode = new ListNode(30);

        dlldl.head = fNode;
        fNode.next = sNode;
        sNode.previous = fNode;
        sNode.next = tNode;
        tNode.previous = sNode;
        dlldl.tail = tNode;

        dlldl.displayForeword();
        dlldl.displayBackword();

        dlldl.delLast();
        dlldl.delLast();
        // dlldl.delLast();
        // dlldl.delLast();

        dlldl.displayForeword();
        dlldl.displayBackword();
    }
}
