package _28;

public class Solution {
    public int strStr(String haystack, String needle) {
        char[] c1 = haystack.toCharArray();
        char[] c2 = needle.toCharArray();
        if (c2.length < c1.length) {
            return -1;
        }
        for (int i = 0; i < c1.length; i++) {
            int j = 0;
            while (j < c2.length){
                if (i + j >= c1.length){
                    break;
                }else {
                    if (c2[j] == c1[i + j]){
                        j++;
                    }else {
                        break;
                    }
                }
            }
            if (j == c2.length){
                return i;
            }
        }
        return -1;
    }
}
