package _144;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        pre(root, list);
        return list;
    }

    public void pre(TreeNode node , List<Integer> l){
        if (node != null) {
            l.add(node.val);
            pre(node.left, l);
            pre(node.right, l);
        }
    }
}