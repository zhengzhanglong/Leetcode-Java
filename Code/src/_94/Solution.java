package _94;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        inorder(root, list);
        return list;
    }

    public void inorder(TreeNode node , List<Integer> l){
        if (node != null) {
            inorder(node.left, l);
            l.add(node.val);
            inorder(node.right, l);
        }
    }
}