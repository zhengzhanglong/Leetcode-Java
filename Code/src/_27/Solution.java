package _27;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int sum = 0;
        for (int i = 0; i < nums.length;i++) {

            if(sum != 0){
                nums[i - sum] = nums[i];
            }

            if (nums[i] == val) {
                sum++;
            }
        }

        return sum;

    }
}
