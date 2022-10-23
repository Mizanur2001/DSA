import java.util.EmptyStackException;

public class stringRevStack {
    private class ListNode {
        private char data;
        private ListNode next;

        public ListNode(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode top;

    public void push(char value) {
        ListNode newNode = new ListNode(value);
        newNode.next = top;
        top = newNode;
    }

    public char pop() {
        char result;
        if (top == null) {
            throw new EmptyStackException();
        }

        result = top.data;
        top = top.next;
        return result;
    }

    public static String Reverse(String str) {
        stringRevStack strRev = new stringRevStack();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            strRev.push(c);
        }

        for (int i = 0; i < str.length(); i++) {
            chars[i] = strRev.pop();
            System.out.print(chars[i]);
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "james Lev";
        System.out.println("Before reverce string -- > " + str);
        System.out.println("After reverce string -- > " + Reverse(str));
    }
}
