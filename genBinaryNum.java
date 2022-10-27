import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class genBinaryNum {
    private class ListNode {
        private String data;
        private ListNode next;

        public ListNode(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode front;
    public ListNode rear;

    public void enQueue(String value) {
        ListNode newNode = new ListNode(value);
        if (front == null && rear == null) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
    }

    public String deQueue() {
        if (front == null && rear == null) {
            throw new NoSuchElementException();
        }
        String result = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return result;
    }

    public String[] genBinary(int n) {
        String[] str = new String[n];
        enQueue("1");
        for (int i = 0; i < n; i++) {
            str[i] = deQueue();
            String n1 = str[i] + "0";
            String n2 = str[i] + "1";
            enQueue(n1);
            enQueue(n2);
        }
        return str;
    }

    public static void main(String[] args) {
        genBinaryNum gbn = new genBinaryNum();
        System.out.print("Enter The value of n = ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(Arrays.toString(gbn.genBinary(n)));
        }
    }
}
