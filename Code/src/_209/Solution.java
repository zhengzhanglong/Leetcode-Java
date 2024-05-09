package _209;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = nums[0];
        int minLength = Integer.MAX_VALUE;

        if (sum >= target) return 1;
        for (int i = 1; i <nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                if (sum - nums[left] < target) {
                    break;
                }else {
                    sum -= nums[left++];
                }
            }
            if (sum >= target){
                minLength = Math.min(minLength, i - left + 1);
            }
        }
        if (minLength == Integer.MAX_VALUE){
            return 0;
        }
        return minLength;

    }
}
