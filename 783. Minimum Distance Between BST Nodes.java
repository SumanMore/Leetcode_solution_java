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
    public int minDiffInBST(TreeNode root) 
    {
         inorder(root,ob);
         int min=ob.get(ob.size()-1);
         for(int i=0;i<ob.size()-1;i++)
         {
             for(int j=i+1;j<ob.size();j++)
             {
               min=Math.min(Math.abs(ob.get(i)-ob.get(j)),min);
             }
         }
         return min;
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
