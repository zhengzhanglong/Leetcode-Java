package _42;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int leftMax = 0;
        for (int i = 0; i < height.length; i++) {
            left[i] = Math.max(left[i], leftMax);
            if (height[i] > leftMax) {
                leftMax = height[i];
            }
        }
        int rightMax = 0;
        for (int i = height.length-1; i >= 0; i--) {
            right[i] = Math.max(right[i], rightMax);
            if (height[i] > rightMax) {
                rightMax = height[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] < left[i] && height[i] < right[i]) {
                sum += (Math.min(left[i],right[i])-height[i]);
            }
        }

        return sum;
    }
}
