package _145;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        post(root, list);
        return list;
    }

    public void post(TreeNode node , List<Integer> l){
        if (node != null) {
            post(node.left, l);
            post(node.right, l);
            l.add(node.val);
        }
    }
}