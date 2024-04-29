package _738;

public class Solution {
    public int monotoneIncreasingDigits(int n) {
        //得到该数的位数
        String str = n +"";
        int length = str.length();
        //创建数组，存放各位数字
        int[] digits = new int[length];

        char[] chars = str.toCharArray();
        for (int i = 0;i < chars.length;i++) {
            //char转化为int，利用ASSCII码的差值，直接用char的值减去‘0’就行了
            digits[i] = chars[i]-'0';
        }

        for (int i = length - 1;i >= 0;i--) {
            if (judge(digits)) {
                return sum(digits);
            }else {
                digits[i] = 9;
                forword(i-1,digits);
            }
        }
        return sum(digits);
    }

    public void forword(int index,int[] digits) {
        for (int i = index; i >= 0; i--) {
            if (digits[i] > 0){
                digits[i]--;
                break;
            }else {
                digits[i] = 9;
            }
        }
    }

    public boolean judge(int[] dig){
        for (int i = 1;i < dig.length;i++){
            if(dig[i] < dig[i-1]){
                return false;
            }
        }
        return true;
    }

    public int sum(int[] s){
        int sum = 0;
        for (int i = 0;i < s.length;i++) {
            sum = sum*10 + s[i];
        }
        return sum;
    }
}
