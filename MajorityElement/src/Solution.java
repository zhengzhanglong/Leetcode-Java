public class Solution {
    public int majorityElement(int[] nums) {

        int fMajor,fCount;
        int sMajor=0,sCount=0;

        if (nums.length == 1){
            return nums[0];
        }else{
            fMajor = nums[0];
            fCount = 1;

            for (int i = 1; i < nums.length; i++){
                if (nums[i] == fMajor){
                    fCount++;
                }else if (nums[i] == sMajor && sCount != 0){
                    sCount++;
                    if (sCount >= fCount){
                        int temp1 = fMajor;
                        fMajor = nums[i];
                        int temp = fCount;
                        fCount = sCount;
                        sMajor = temp1;
                        sCount = temp;
                    }
                }else {
                    sMajor = nums[i];
                    sCount = 1;
                }
            }
        }
        return fMajor;
    }
}
