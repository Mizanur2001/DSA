import java.util.NoSuchElementException;

public class uqeue2 {

    public uqeue2() {
        length = 0;
        front = null;
        rear = null;
    }

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode front;
    public ListNode rear;
    public int length;

    public boolean isEmpy() {
        return length == 0;
    }

    public void dispaly() {
        if (isEmpy()) {
            return;
        }
        ListNode temp = front;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void enQueue(int value) {
        ListNode newNode = new ListNode(value);
        if (isEmpy()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        length++;
    }

    public int deQueue() {
        if (isEmpy()) {
            throw new NoSuchElementException();
        }
        int result = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        length--;
        return result;
    }

    public int first() {
        if (isEmpy()) {
            throw new NoSuchElementException();
        }
        return front.data;
    }

    public int last() {
        if (isEmpy()) {
            throw new NoSuchElementException();
        }
        return rear.data;
    }

    public static void main(String[] args) {
        uqeue2 u2 = new uqeue2();
        u2.enQueue(5);
        u2.enQueue(10);
        u2.enQueue(15);
        u2.enQueue(20);
        u2.dispaly();
        
        u2.deQueue();
        System.out.println("front is --> " + u2.first());
        System.out.println("rear is --> " + u2.last());

        u2.deQueue();
        u2.deQueue();
        u2.deQueue();

        u2.dispaly();
    }

}
