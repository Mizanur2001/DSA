public class doulyLinkListInsertBeg {
    private static class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;

        private ListNode(int data) {
            this.data = data;
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

    public void insertBeginning(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        doulyLinkListInsertBeg dllib = new doulyLinkListInsertBeg();
        ListNode firstNode = new ListNode(1);
        ListNode SecondNode = new ListNode(20);

        dllib.head = firstNode;
        firstNode.next = SecondNode;
        SecondNode.previous = firstNode;
        dllib.tail = SecondNode;

        dllib.insertBeginning(50);
        dllib.insertBeginning(100);
        dllib.insertBeginning(56);

        dllib.displayForeword();
        dllib.displayBackword();
    }
}
