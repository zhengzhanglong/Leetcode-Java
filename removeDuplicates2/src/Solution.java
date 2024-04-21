public class Solution {
    public int removeDuplicates(int[] nums) {
        int sumRepeat = 0, nowRepeat = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - nowRepeat - 1]) {
                nowRepeat++;
                if (nowRepeat > 1) sumRepeat++;
            }else{
                nowRepeat = 0;
            }
            nums[i-sumRepeat] = nums[i];
        }
        return nums.length - sumRepeat;
    }
}
