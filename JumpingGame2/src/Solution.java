import java.lang.reflect.Array;

public class Solution {
    public int jump(int[] nums) {
        int[] minSteps = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i]  && i + j + 1 <nums.length; j++) {
                if (minSteps[i+j+1] == 0) {
                    minSteps[i+j+1] = minSteps[i]+1;
                    if (i + j + 1 == nums.length-1) return minSteps[i+j+1];
                }
            }
        }

    }
}
