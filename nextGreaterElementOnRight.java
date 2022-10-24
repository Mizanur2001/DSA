import java.util.Arrays;
import java.util.EmptyStackException;

//problem :- given an array of integers  . for each element in the array,find its next greater element in that array .
//the next greater element is the first element towards right , which is greater than current element 

public class nextGreaterElementOnRight {
    private static class ListNode {
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
        int retsult;
        if (top == null) {
            throw new EmptyStackException();
        }
        retsult = top.data;
        top = top.next;
        return retsult;
    }

    public int peek() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public int[] FindNextgreaterElement(int[] array) {
        int[] retsult = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            if (top != null) {
                while (top != null && peek() <= array[i]) {
                    pop();
                }
            }

            if (top == null) {
                retsult[i] = -1;
            } else {
                retsult[i] = peek();
            }
            push(array[i]);
        }
        return retsult;
    }

    public static void main(String[] args) {
        nextGreaterElementOnRight ngeor = new nextGreaterElementOnRight();
        int[] arr = { 4, 7, 3, 4, 8, 1 };
        System.out.println(Arrays.toString(ngeor.FindNextgreaterElement(arr)));
    }
}
