package _1005;

import java.util.Arrays;

public class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {

        int point = 0;
        int sum = 0;

        Arrays.sort(nums);

        for (int i = 0; i < k; i++) {
            if (point >= nums.length) {
                nums[nums.length - 1] = (k - i)%2 == 0 ? nums[nums.length - 1] : -nums[nums.length - 1]; ;
                break;
            }

            if (nums[point] < 0) {
                nums[point] = -nums[point];
                point++;
            }else {
                if (point != 0 && nums[point-1] < nums[point]) {
                    nums[point-1] = (k - i)%2 == 0 ? nums[point - 1] : -nums[point - 1];
                }else {
                    nums[point] = (k - i)%2 == 0 ? nums[point] : -nums[point];
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
