public class searchLinkList {
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
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int searchListNode(int SearchedNumber) {
        if (head == null) {
            return -1;
        }
        ListNode current = head;
        int Position = 1;
        while (current != null) {
            if (SearchedNumber == current.data) {
                return Position;
            }
            current = current.next;
            Position++;
        }
        return -1;
    }

    public static void main(String[] args) {
        searchLinkList sll = new searchLinkList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode forth = new ListNode(11);

        sll.head.next = second;
        second.next = third;
        third.next = forth;

        sll.display();
        int num = sll.searchListNode(8);
        if (num != -1) {
            System.out.println("Number found at possition " + num);
        } else {
            System.out.println("Number not found :(");
        }
    }
}
