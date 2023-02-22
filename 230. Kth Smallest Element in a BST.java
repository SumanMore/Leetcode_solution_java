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
    ArrayList<Integer> ob=new ArrayList<Integer>();
    public int kthSmallest(TreeNode root, int k) 
    {
         inorder(root,ob);
         if(ob.size()<k)
           return -1;
         return ob.get(k-1);
    }
  void inorder(TreeNode root , ArrayList<Integer> ob)
  {
      if(root==null)
         return ;
      inorder(root.left,ob);
      ob.add(root.val);
      inorder(root.right,ob);
  }

}
