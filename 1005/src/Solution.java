import java.util.Arrays;

public class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {

        int point = 0;
        int sum = 0;
        int minpos = Integer.MAX_VALUE;

        Arrays.sort(nums);
        for (int i = 0; i < k; i++) {
            if (point == nums.length-1) {
                if (nums[point] < 0)
                    nums[point] = -nums[point];

                minpos = Math.min(minpos, nums[point]);
                if ((k - i)%2 == 1) {
                    sum -= 2*minpos;
                }
                break;

            }
            if (nums[point] < 0) {
                nums[point] = -nums[point];
                minpos = Math.min(minpos, nums[point]);
                point++;
            }else {
                minpos = Math.min(minpos, nums[point]);
                if ((k - i)%2 == 1) {
                    sum -= 2*minpos;
                }
                break;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum;
    }
}
