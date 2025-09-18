package Programs;

import java.util.Stack;

public class ValidParentheses {

    static String s = "()[]{}";

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); // push opening brackets
            } else {
                if (stack.isEmpty()) {
                    System.out.println("false");
                    return; // no matching opening
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    System.out.println("false");
                    return;
                }
            }
        }

        // If stack is empty at the end, it's valid
        if (stack.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
