package _1047;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public String removeDuplicates(String s) {
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!list.isEmpty()){
                Character top = list.getLast();
                if (top == c){
                    list.removeLast();
                    continue;
                }
            }
            list.add(c);
        }
       StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }
}
