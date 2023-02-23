/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ob = new ArrayList<>();
        preorder(root,ob);
        return ob;
        
    }
    private static void preorder(TreeNode root,ArrayList<Integer> list)
    {
        if(root==null)
            return;
        list.add(root.val);
        preorder(root.left,list);
        preorder(root.right,list);
    }
}
