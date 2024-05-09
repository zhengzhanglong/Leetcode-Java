package _977;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int p = 0;
        int p1,p2;
        int[] res = new int[nums.length];
        int count = 0;
        while (p < nums.length && nums[p] < 0) p++;
        if (p > 0){
            if (nums[p-1] + nums[p] > 0){
                p--;
            }
        }
        p1 = p - 1;
        p2 = p + 1;
        res[count++] = nums[p] * nums[p];
        for (int i = 1; i < nums.length; i++) {
            if (p1 >= 0 && p2 < nums.length){
                if (nums[p1]*nums[p1] > nums[p2]*nums[p2]){
                    res[count++] = nums[p2] * nums[p2];
                    p2++;
                }else {
                    res[count++] = nums[p1] * nums[p1];
                    p1--;
                }
            }else if (p1 >= 0){
                res[count++] = nums[p1] * nums[p1];
                p1--;
            }else if (p2 < nums.length){
                res[count++] = nums[p2] * nums[p2];
                p2++;
            }
        }
        return res;
    }
}
