public class insertNodeSorted {
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

    public ListNode InsertNodeSorted(int value) {
        ListNode newListNode = new ListNode(value);
        if (head == null) {
            return newListNode;
        }

        ListNode current = head;
        ListNode temp = null;

        while (current != null && current.data < newListNode.data) {
            temp = current;
            current = current.next;
        }
        if (head.data > newListNode.data) {
            newListNode.next = current;
            head = newListNode;
            return head;
        }
        newListNode.next = current;
        temp.next = newListNode;
        return head;
    }

    public static void main(String[] args) {
        insertNodeSorted ins = new insertNodeSorted();
        ins.head = new ListNode(10);
        ListNode firstNode = new ListNode(12);
        ListNode secondNode = new ListNode(14);
        ListNode ThirdNode = new ListNode(18);
        ListNode frothNode = new ListNode(19);
        ins.head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = ThirdNode;
        ThirdNode.next = frothNode;

        ins.display();
        ins.InsertNodeSorted(0);
        ins.display();
    }
}