package _216;

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        combineHelper(n, k,0, 1);
        return result;
    }
    /**
     * 每次从集合中选取元素，可选择的范围随着选择的进行而收缩，调整可选择的范围，就是要靠startIndex
     * @param startIndex 用来记录本层递归的中，集合从哪里开始遍历（集合就是[1,...,n] ）。
     */
    private void combineHelper(int n, int k,int sum, int startIndex){
        //终止条件
        if (path.size() == k && sum == n){
            result.add(new ArrayList<>(path));
            return;
        }
        if(sum + startIndex > n){
            return;
        }
        for (int i = startIndex; i <= 9 - (k - path.size()) + 1; i++){
            path.add(i);
            combineHelper(n, k,sum+i, i + 1);
            path.removeLast();
        }
    }

}