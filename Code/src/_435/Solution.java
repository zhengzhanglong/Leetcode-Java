package _435;

import java.util.Arrays;
import java.util.LinkedList;

public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            if (a[0] == b[0]){
                return a[1] > b[1] ? 1 : -1;
            }
            return a[0] > b[0] ? 1 : -1;
        });

        int count = 0;
        int right = intervals[0][1];

        for (int i = 1; i < intervals.length; i++){
            if (intervals[i][0] < right){
                count++;
                right = Math.min(intervals[i][1], right) ;
            }else {
                right = intervals[i][1];
            }
        }

        return count;
    }
}
