package _39;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        comb(res, new ArrayList<Integer>(),0,candidates, 0, target);
        return res;
    }

    public void comb (List<List<Integer>> res,List<Integer> list,int startIndex,int[] cand, int sum, int targ){
        if (sum == targ) {
            res.add(List.copyOf(list));
            return;
        }
        if (sum > targ) {
            return;
        }

        for (int i = startIndex; i < cand.length; i++) {
            list.add(cand[i]);
            comb(res, list,i, cand, sum+cand[i], targ);
            list.removeLast();
        }
    }
}
