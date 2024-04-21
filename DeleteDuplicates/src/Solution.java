public class Solution {
    public int removeDuplicates(int[] nums) {
        int front = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[front]) {
                nums[++front] = nums[i];
            }
        }
        return front + 1;
    }
}
