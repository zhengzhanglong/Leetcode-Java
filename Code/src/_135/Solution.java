package _135;

public class Solution {
    public int candy(int[] ratings) {
        /**
         分两个阶段
         1、起点下标1 从左往右，只要 右边 比 左边 大，右边的糖果=左边 + 1
         2、起点下标 ratings.length - 2 从右往左， 只要左边 比 右边 大，此时 左边的糖果应该 取本身的糖果数（符合比它左边大） 和 右边糖果数 + 1 二者的最大值，这样才符合 它比它左边的大，也比它右边大
         */
        int len = ratings.length;
        int[] candyVec = new int[len];
        candyVec[0] = 1;
        for (int i = 1; i < len; i++) {
            candyVec[i] = (ratings[i] > ratings[i - 1]) ? candyVec[i - 1] + 1 : 1;
        }

        for (int i = len - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candyVec[i] = Math.max(candyVec[i], candyVec[i + 1] + 1);
            }
        }

        int ans = 0;
        for (int num : candyVec) {
            ans += num;
        }
        return ans;
    }
}
