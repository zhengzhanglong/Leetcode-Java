package _746;

public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int costBefore = 0;
        int costAfter = 0;
        for (int i = 2; i < cost.length; i++) {
            int temp = Math.min(costBefore + cost[i-2], costAfter + cost[i-1]);
            costBefore = costAfter;
            costAfter = temp;
        }
        return Math.min(costBefore + cost[cost.length-2], costAfter + cost[cost.length-1]);
    }
}
