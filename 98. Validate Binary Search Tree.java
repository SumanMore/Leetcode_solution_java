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
    public boolean isValidBST(TreeNode root) 
    {
       inorder(root,ob);
       for(int i=0;i<ob.size()-1;i++)
       {
           if(ob.get(i)>=ob.get(i+1))
           {
               return false;
           }
       }
       return true;

        
    }
    void inorder(TreeNode root, ArrayList<Integer> ob)
    {
        if(root==null)
            return;
        inorder(root.left,ob);
        ob.add(root.val);
        inorder(root.right,ob);
    }
}
