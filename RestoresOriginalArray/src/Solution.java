import java.util.Arrays;

public class Solution {
    public int[] findOriginalArray(int[] changed) {
        int[] result = new int[changed.length/2];
        int length = changed.length;

        for (int i = 0; i < changed.length; i++) {
            for (int j = i+1; j < length; j++) {
                if (changed[j] * 2 == changed[i]) {
                    int temp = changed[j];
                    changed[i] = changed[j];
                    changed[j] = temp;
                    j = i + 1;
                }
            }
            for (int j = i+1; j < length; j++) {
                if (changed[j] == changed[i] * 2) {
                    changed[j] = changed[length-1];
                    length--;
                }
            }
        }

        if (length * 2 != changed.length) {
            return new int[0];
        }else {
            for (int i = 0; i < length; i++) {
                result[i] = changed[i];
            }
            return result;
        }

    }
}
