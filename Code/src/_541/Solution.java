package _541;

public class Solution {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int x = 0;
        for (int i = 1; i < chars.length && chars.length >= k; i+=k) {
            if (i+k-1 <=chars.length){
                if (x%2 == 0){
                    reverseString(chars,i-1,i+k-2);
                    x++;
                }else {
                    x++;
                }
            }
        }
        if (chars.length%k != 0 && (chars.length/k)%2 == 0){
            reverseString(chars,chars.length-chars.length%k,chars.length-1);
        }
        return new String(chars);
    }

    public void reverseString(char[] s, int start, int end) {
        char temp;
        for (int i = start; i < start + (end - start + 1) / 2; i++) {
            temp = s[i];
            s[i] = s[end - (i - start)];
            s[end - (i - start)] = temp;
        }
    }
}
