package _70;

public class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[45];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
