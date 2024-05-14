package _150;

import java.util.LinkedList;

public class Solution {
    public int evalRPN(String[] tokens) {
        LinkedList<String> stack = new LinkedList<String>();
        for (String token : tokens) {
            if (token.equals("+")) {
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(num2 + num1));
            }else if (token.equals("-")) {
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(num2 - num1));
            }else if (token.equals("*")) {
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(num2 * num1));
            }else if (token.equals("/")) {
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(num2 / num1));
            }else {
                stack.push(token);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
