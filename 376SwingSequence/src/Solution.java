public class Solution {
    public int wiggleMaxLength(int[] nums) {
        int flag = 0;//-1表示减，1表示增
        int x = 1;
        int maxLength = 1;

        if (nums.length <= 1){
            return nums.length;
        }else if (nums.length == 2){
            return nums[0] == nums[1] ? 1 : 2;
        }else {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[0]){
                    x = i;
                    break;
                }
            }
            if (nums[x] - nums[0] < 0){
                flag = 1;
            }else {
                flag = -1;
            }

            for (int i = x; i < nums.length; i++) {
                int differ = nums[i] - nums[i-1];
                if ( differ * flag < 0 ){
                    maxLength++;
                    flag = -flag;
                }
            }
            return maxLength;

        }
    }

}
