public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] now = new int[gas.length];
        int nowgas = 0;
        int mingas = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            nowgas = nowgas + gas[i] - cost[i];
            if (nowgas < mingas) {
                mingas = nowgas;
                start = i;
            }
        }
        if (nowgas >= 0){
            return start;
        }else {
            return -1;
        }
    }
}
