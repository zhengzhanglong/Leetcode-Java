package _20;

import java.util.LinkedList;

public class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }else if (c == ')'){
                if (stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if (top != '('){
                    return false;
                }
            }else if (c == '}'){
                if (stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if (top != '{'){
                    return false;
                }
            }else if (c == ']'){
                if (stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if (top != '['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

class test{
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("{[]}"));
    }
}
