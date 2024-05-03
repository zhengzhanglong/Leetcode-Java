package _188;

public class Solution {
    public int maxProfit(int k, int[] prices) {
        int len = prices.length;
        // 边界判断, 题目中 length >= 1, 所以可省去
        if (prices.length == 0) return 0;

        /*
         * 定义 5 种状态:
         * 0: 没有操作, 1: 第一次买入, 2: 第一次卖出, 3: 第二次买入, 4: 第二次卖出
         */
        int[][] dp = new int[len][2*k+1];
        for (int i = 1; i < 2*k+1; i+=2) {
            dp[0][i] = -prices[0];
        }

        for (int i = 1; i < len; i++) {
            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
            for (int j = 2; j < 2*k+1; j++) {
                dp[i][j] = (int) Math.max(dp[i - 1][j], dp[i - 1][j-1] + Math.pow(-1,j)*prices[i]);
            }
        }

        return dp[len - 1][2*k];
    }
}
