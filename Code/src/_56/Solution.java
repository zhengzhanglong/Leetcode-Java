package _56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

//在 JDK7 版本以上，Comparator 要满足自反性，传递性，对称性，否则 Arrays.sort，Collections.sort都会报 IllegalArgumentException 异常。

//自反性：当两个相同的元素相比时，compare必须返回0，也就compare(o1, o1) = 0;
//反对称性：如果compare(o1,o2) = 1，则compare(o2, o1)必须返回符号相反的值也就是 -1；
//传递性：如果 a>b, b>c, 则 a必然大于c。也就是compare(a,b)>0,compare(b,c)>0, 则compare(a,c)>0

public class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });
        ArrayList<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] > res.getLast()[1]) {
                res.add(intervals[i]);
            }else {
                int[] temp = res.getLast();
                res.removeLast();
                temp[1] = Math.max(temp[1], intervals[i][1]);
                res.add(temp);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
