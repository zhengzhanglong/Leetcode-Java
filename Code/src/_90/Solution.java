package _90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        res.add(new ArrayList<>());
        backTrack(0,nums);
        return res;
    }
    public void backTrack(int start, int[] nums){
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            list.add(nums[i]);
            res.add(new ArrayList<>(list));
            backTrack(i+1, nums);
            list.removeLast();
        }
    }
}
