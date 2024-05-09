package _704;

public class Solution {
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target > nums[i]) {
                continue;
            }else if (target < nums[i]) {
                return -1;
            }else {
                return i;
            }
        }
        return -1;
    }
}
