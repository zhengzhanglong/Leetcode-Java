package _309;

public class Solution {
    public int maxProfit(int[] prices) {
        //0 空持 1 持有 2 卖出 3 冻结
        int[][] dp = new int[prices.length+1][4];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        dp[0][2] = 0;
        dp[0][3] = 0;

        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][3]);
            dp[i][1] = Math.max(Math.max(dp[i-1][1],dp[i-1][0]-prices[i]),dp[i-1][3]-prices[i]);
            dp[i][2] = dp[i-1][1]+prices[i];
            dp[i][3] = dp[i-1][2];
        }

        int max = dp[prices.length-1][0];
        for (int i = 0; i < 4; i++) {
            max = Math.max(max, dp[prices.length-1][i]);
        }
        return max;
    }
}
