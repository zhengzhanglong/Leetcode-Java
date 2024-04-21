import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        // 返回结果乘积
        int[] product = new int[n];

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        // nums 的首位和末尾的元素分别没有前缀和后缀，因此初始化为 1
        prefix[0] = 1; suffix[n - 1] = 1;

        // 分别计算前后缀
        for (int i = 1; i < n; i++) {
            prefix[i] = nums[i - 1] * prefix[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = nums[i + 1] * suffix[i + 1];
        }

        // 基于前后缀计算结果
        for (int i = 0; i < n; i++) {
            product[i] = prefix[i] * suffix[i];
        }
        return product;

    }

}
