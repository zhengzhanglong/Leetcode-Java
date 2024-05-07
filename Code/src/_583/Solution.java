package _583;

public class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1]; // 先对dp数组做初始化操作
        for (int i = 1 ; i <= word1.length() ; i++) {
            char char1 = word1.charAt(i - 1);
            for (int j = 1; j <= word2.length(); j++) {
                char char2 = word2.charAt(j - 1);
                if (char1 == char2) { // 开始列出状态转移方程
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return word1.length()+word2.length()-2*dp[word1.length()][word2.length()];
    }
}
