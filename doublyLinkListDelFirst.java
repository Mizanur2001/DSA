import java.util.NoSuchElementException;

public class doublyLinkListDelFirst {
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

    public ListNode delfirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        ListNode temp = head;
        if (head == tail) {
            tail = null;
        } else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        return temp;
    }

    public static void main(String[] args) {
        doublyLinkListDelFirst dlldf = new doublyLinkListDelFirst();
        ListNode fNode = new ListNode(10);
        ListNode sNode = new ListNode(20);
        ListNode tNode = new ListNode(30);

        dlldf.head = fNode;
        fNode.next = sNode;
        sNode.previous = fNode;
        sNode.next = tNode;
        tNode.previous = sNode;
        dlldf.tail = tNode;

        dlldf.displayForeword();
        dlldf.displayBackword();

        // dlldf.delfirst();
        // dlldf.delfirst();
        dlldf.delfirst();
        dlldf.delfirst();

        dlldf.displayForeword();
        dlldf.displayBackword();

    }
}