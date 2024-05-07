package _392;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        boolean flag = false;
        int i = 0;
        if (s1.length == 0) {
            return true;
        }else if (t1.length < s1.length) {
            return false;
        }

        for (int j = 0; j < t1.length; j++) {
            if (t1[j] == s1[i]) {
                i++;
                if (i == s1.length) {
                    flag = true;
                    break;
                }
            }
        }

        return flag;
    }
}
