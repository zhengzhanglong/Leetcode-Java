import java.util.Arrays;

public class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h = 0;

        for (int i = 1; i <= citations.length; i++) {
            if (citations[citations.length - i] >= h + 1) {
                h++;
            }else {
                break;
            }
        }

        return h;

    }
}
