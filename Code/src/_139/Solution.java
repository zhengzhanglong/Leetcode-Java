package _139;


import java.util.List;

public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (String string : wordDict) {
                if (i - string.length() >= 0){
                    if (string.equals(s.substring(i - string.length(),i)) && dp[i - string.length()]){
                        dp[i] = true;
                    };
                }
            }
        }
        return dp[s.length()];
    }
}
