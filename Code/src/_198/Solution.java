package _198;

public class Solution {
    public int rob(int[] nums) {
        int steal = nums[0];
        int unsteal = 0;
        int stillunsteal = 0;

        for (int i = 1; i < nums.length; i++) {
            int temp = steal;
            int temp2 = Math.max(unsteal,stillunsteal) + nums[i];
            stillunsteal = unsteal;
            unsteal = temp;
            steal = temp2;
        }
        return Math.max(steal, unsteal);

    }
}
