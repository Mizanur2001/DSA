public class uqeue {

    public uqeue() {
        this.front = null;
        this.rear = null;
        length = 0;
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

    public void dispaly() {
        ListNode temp = front;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        uqeue uqeue = new uqeue();
        uqeue.enQueue(5);
        uqeue.enQueue(10);
        uqeue.enQueue(15);
        uqeue.enQueue(20);

        uqeue.dispaly();
    }
}
