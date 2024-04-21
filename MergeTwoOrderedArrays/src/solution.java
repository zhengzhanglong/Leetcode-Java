public class solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        int k = 0;
        int[] temp = new int[m + n + 1];

        while (i < m && j < n) {
            if (i == 0 && j == 0) {
                if (nums1[i] <= nums2[j]) {
                    temp[k++] = nums1[i++];
                }else {
                    temp[k++] = nums2[j++];
                }
            }else{
                if (nums1[i] <= nums2[j]) {
                    temp[k++] = nums1[i++];
                }else {
                    temp[k++] = nums2[j++];
                }
            }
        }

        if (i == m) {
            while (j < n){
                temp[k++] = nums2[j++];
            }
        }else if (j == n) {
            while (i < m){
                temp[k++] = nums1[i++];
            }
        }

        for (int o = 0; o < temp.length; o++) {
            nums1[o] = temp[o];
        }
    }
}

