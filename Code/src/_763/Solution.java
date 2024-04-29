package _763;

import java.util.ArrayList;
import java.util.List;

//a 97  A 65
public class Solution {
    public List<Integer> partitionLabels(String s) {
        char[] s2 = s.toCharArray();
        int[] lowercase1 = new int[26];
        int[] lowercase2 = new int[26];
        ArrayList<Integer> result = new ArrayList<>();
        int count = 0;

        //统计各个字母个数
        for (int i = 0; i < s.length(); i++) {
            lowercase1[s2[i] - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            lowercase2[s2[i] - 'a']++;
            count++;
            if (judge(lowercase1, lowercase2)) {
                result.add(count);
                count = 0;
            }
        }

        return result;

    }

    public boolean judge(int[] l1, int[] l2) {
        for (int i = 0; i < l1.length; i++) {
            if (l2[i] != 0 && (l1[i] - l2[i] != 0)){
                return false;
            }
        }
        return true;
    }

}
