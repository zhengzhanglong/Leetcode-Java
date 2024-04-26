package _452;

import java.util.Arrays;

public class Solution {
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, (a, b) -> {
            if (a[0] == b[0]){
                return a[1] >= b[1] ? 1 : -1;
            }
            return a[0] >= b[0] ? 1 : -1;
        });

        int count = 1;
        int current = 0;

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > points[current][1]){
                count++;
                current = i;
            }else if (points[i][1] <= points[current][1]){
                points[current][0] = points[i][0];
                points[current][1] = points[i][1];
            }else if (points[i][1] > points[current][1]){
                points[current][0] = points[i][0];
            }
        }
        return count;
    }
}
