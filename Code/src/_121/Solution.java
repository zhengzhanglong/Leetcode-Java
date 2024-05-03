package _121;

public class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int earn = 0;

        if (prices.length == 1){
            return 0;
        } else{
            for (int i = 1; i < prices.length; i++) {
                earn = Math.max((prices[i] - min), earn);
                min = Math.min(prices[i], min);
            }
            return earn;
        }
    }
}
