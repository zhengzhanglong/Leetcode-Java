package _347;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .toList();
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(list.size()-k+i).getKey();
        }
        Arrays.sort(res);
        return res;
    }
}
