import java.util.Arrays;

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int j = g.length - 1;
        int count = 0;

        for (int i = s.length - 1; i >= 0; i++){
            while (s[i] < g[j] && j >= 0){
                j--;
            }
            if (j >= 0 && g[j] <= s[i]){
                j--;
                count++;
            }
        }

        return count;

    }

}
