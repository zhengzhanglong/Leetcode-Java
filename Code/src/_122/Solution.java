package _122;

public class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int localmin = prices[0];

        for (int i = 0; i < prices.length; i++) {

            if(i == prices.length-1){
                if(prices[i] == localmin){
                    return max;
                }else {
                    max += prices[i] - localmin;
                }
            }else {
                if(prices[i+1] < prices[i]){
                    max += prices[i] - localmin;
                    localmin = prices[i+1];
                }
            }

        }
        return max;

    }

}
