package _739;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        List<Integer[]> list = new LinkedList<>();
        for (int i = 0; i < temperatures.length; i++) {
            if (list.size() != 0) {
                while (list.size() != 0) {
                    Integer[] arr = list.removeLast();
                    if (arr[1] < temperatures[i]) {
                        res[arr[0]] = i - arr[0];
                    }else {
                        list.add(arr);
                        break;
                    }
                }
            }
            list.add(new Integer[]{i, temperatures[i]});
        }
        return res;
    }
}
