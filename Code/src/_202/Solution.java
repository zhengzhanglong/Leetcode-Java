package _202;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
            n = caculate(n);
        }
        return true;
    }

    public int caculate(int n) {
        List<Integer> list = new ArrayList<>();
        Integer j = 0;
        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            j = list.get(i);
            sum += j * j;
        }
        return sum;
    }
}
