import java.util.EmptyStackException;

public class stack {
    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode top;

    public void push(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        int result;
        if (top == null) {
            throw new EmptyStackException();
        }

        result = top.data;
        top = top.next;
        return result;
    }

    public int keep() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public static void main(String[] args) {
        stack stack = new stack();
        stack.push(5);
        stack.push(10);
        stack.push(115);
        stack.push(11);

        System.out.println(stack.keep());
        System.out.println("deleted --> "+stack.pop());
        System.out.println("deleted --> "+stack.pop());
        System.out.println("deleted --> "+stack.pop());
        System.out.println("deleted --> "+stack.pop());
        
        // System.out.println(stack.keep());
    }

}
