import java.util.NoSuchElementException;

public class circularLinkListDelFirst {
    private static class ListNode {
        private int data;
        private ListNode next;

        private ListNode(int data) {
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
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public ListNode delFirst() {
        if (last == null) {
            throw new NoSuchElementException("Circular Link List is Empty");
        }
        ListNode temp = last.next;
        if (last.next == last) {
            last = null;
        } else {
            last.next = temp.next;
        }
        temp.next = null;
        return temp;
    }

    public static void main(String[] args) {
        circularLinkListDelFirst clldf = new circularLinkListDelFirst();
        ListNode fNode = new ListNode(10);
        ListNode sNode = new ListNode(15);
        ListNode tNode = new ListNode(17);
        ListNode lNode = new ListNode(37);
        fNode.next = sNode;
        sNode.next = tNode;
        tNode.next = lNode;
        lNode.next = fNode;
        clldf.last = lNode;
        clldf.display();

        System.out.println("deleted element --> "+clldf.delFirst().data);
        System.out.println("deleted element --> "+clldf.delFirst().data);
        System.out.println("deleted element --> "+clldf.delFirst().data);
        System.out.println("deleted element --> "+clldf.delFirst().data);
        // System.out.println("deleted element --> "+clldf.delFirst().data);
        clldf.display();

    }
}