package _225;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {

}

class MyStack {

    LinkedList<Integer> stack;

    public MyStack() {
        stack = new LinkedList<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        int x = stack.getFirst();
        stack.removeFirst();
        return x;
    }

    public int top() {
        return stack.getFirst();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */