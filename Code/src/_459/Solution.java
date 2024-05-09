package _459;

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 1; i < charArray.length; i++) {
            if (charArray.length % i == 0){
                for (int j = 0; j < charArray.length; j+=i) {
                    for (int k = 0; k < i; k++) {
                        if (charArray[j+k] != charArray[k]){
                            j = 2*charArray.length;
                            break;
                        }
                    }
                    if (j == charArray.length-i){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

class test{
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.repeatedSubstringPattern("abaababaab"));
    }
}
