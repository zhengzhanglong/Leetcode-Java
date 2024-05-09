//public class Solution {
//    public boolean canJump(int[] nums) {
//        int maxAvailable = nums[0];
//
//        for (int i = 0; i < maxAvailable; i++) {
//            if (maxAvailable >= nums.length - 1) return true;
//            maxAvailable = Math.max(maxAvailable, i + nums[i]);
//        }
//        return false;
//
//    }
//}
