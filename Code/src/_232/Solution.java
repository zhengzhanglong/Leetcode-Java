package _232;

import java.util.ArrayList;
import java.util.List;

public class Solution {

}

class MyQueue {

    List<Integer>list;

    public MyQueue() {
        list = new ArrayList<Integer>();
    }

    public void push(int x) {
        list.add(x);
    }

    public int pop() {
        return list.removeFirst();
    }

    public int peek() {
        return list.getFirst();
    }

    public boolean empty() {
        return list.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */