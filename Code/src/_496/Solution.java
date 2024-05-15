package _496;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> res = new HashMap<>();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (list.size() != 0) {
                while (list.size() != 0) {
                    Integer arr = list.removeLast();
                    if (arr < nums2[i]) {
                        res.put(arr , nums2[i]);
                    }else {
                        list.add(arr);
                        break;
                    }
                }
            }
            list.add(nums2[i]);
        }
        int[] resArr = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            if (!res.containsKey(nums1[i])) {
                resArr[i] = -1;
            }else {
                resArr[i] = res.get(nums1[i]);
            }
        }
        return resArr;
    }
}
