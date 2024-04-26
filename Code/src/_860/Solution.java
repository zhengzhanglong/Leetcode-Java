package _860;

public class Solution {
    public boolean lemonadeChange(int[] bills) {
        int m5 = 0, m10 = 0;

        for (int bill : bills) {
            if (bill == 5) {
                m5++;
            }else if (bill == 10) {
                if (m5 >= 1){
                    m5--;
                    m10++;
                }else {
                    return false;
                }
            }else {
                if (m10 >= 1 && m5 >= 1){
                    m5--;
                    m10--;
                }else if (m5 >= 3){
                    m5 -= 3;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}

