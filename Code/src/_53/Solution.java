package _53;

public class Solution {
    public int maxSubArray(int[] nums) {
        int maxNum = nums[0];
        int totalMax = 0;
        int localMax = 0;

        for (int i = 0; i < nums.length; i++) {
            maxNum = Math.max(maxNum, nums[i]);
            if (nums[i] >= 0) {
                localMax += nums[i];
                totalMax = Math.max(totalMax, localMax);
            }else {
                if (localMax + nums[i] >= 0) {
                    localMax += nums[i];
                }else {
                    localMax = 0;
                }
            }
        }
        if (maxNum < 0) {
            return maxNum;
        }else {
            return totalMax;
        }

    }
}
