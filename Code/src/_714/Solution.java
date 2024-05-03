package _714;

public class Solution {
    public int maxProfit(int[] prices, int fee) {
        //0 持 1 不持
        int[][] dp = new int[prices.length+1][2];
        dp[0][0] = -prices[0]-fee;

        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] - prices[i] - fee);
            dp[i][1] = Math.max(dp[i-1][0] +prices[i],dp[i-1][1]);
        }

        int max = dp[prices.length-1][0];
        for (int i = 0; i < 2; i++) {
            max = Math.max(max, dp[prices.length-1][i]);
        }
        return max;
    }
}
