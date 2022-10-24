//problem :- Given a string s, containing just the characters '(',')','{','}','['and ']' determine if the the input is valid 
//An input string is valid if :
// . Open brackets must be closed by same type of brackets
//.Open brackets must be closed in correct order 

import java.util.Stack;

public class validParentheses {
    public boolean checkBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.peek();
                    if ((c == '}' && top == '{') || (c == ')' && top == '(') || (c == ']' && top == '[')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        validParentheses vp = new validParentheses();
        System.out.println(vp.checkBrackets("{[([])]}"));
    }
}
