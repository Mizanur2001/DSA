public class circularLinkListInsertLast {
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode last;

    public void display() {
        if (last == null) {
            return;
        }
        ListNode temp = last.next;
        while (temp != last) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (last == null) {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }

    }

    public static void main(String[] args) {
        circularLinkListInsertLast cllil = new circularLinkListInsertLast();

        cllil.insertLast(10);
        cllil.insertLast(13);
        cllil.insertLast(17);
        cllil.display();
    }
}
