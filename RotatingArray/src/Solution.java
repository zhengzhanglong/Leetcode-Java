public class Solution {
    public void rotate(int[] nums, int k) {

        int[] temp = new int[k];

        if (k != 0){
            for (int i = 0; i < k && i < nums.length; i++) {
                int a = i-k;
                while (a < 0){
                    a+= nums.length;
                }
                temp[i] = nums[a];
            }

            for (int j = 0; j < nums.length; j++) {
                int tmp = nums[j];
                nums[j] = temp[j%k];
                temp[j%k] = tmp;
            }
        }

    }
}
