package _46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    List<Integer> temp = new ArrayList<Integer>();
    boolean[] visited;
    public List<List<Integer>> permute(int[] nums) {
        visited = new boolean[nums.length];
        Arrays.fill(visited, false);
        backTrack(nums);
        return ans;
    }
    public void backTrack(int[] nums){
        if (temp.size() == nums.length){
            ans.add(new ArrayList<>(temp));
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;
            temp.add(nums[i]);
            visited[i] = true;
            backTrack(nums);
            visited[i] = false;
            temp.removeLast();
        }
    }

}
