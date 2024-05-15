package _503;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        List<Integer[]> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (list.size() != 0) {
                while (list.size() != 0) {
                    Integer[] arr = list.removeLast();
                    if (arr[1] < nums[i]) {
                        res[arr[0]] = nums[i];
                    }else {
                        list.add(arr);
                        break;
                    }
                }
            }
            list.add(new Integer[]{i, nums[i]});
        }
        for (int i = 0; i < nums.length; i++) {
            if (list.size() != 0) {
                while (list.size() != 0) {
                    Integer[] arr = list.removeLast();
                    if (arr[1] < nums[i]) {
                        res[arr[0]] = nums[i];
                    }else {
                        list.add(arr);
                        break;
                    }
                }
            }
        }
        list.forEach(l -> res[l[0]] = -1);
        return res;
    }
}
