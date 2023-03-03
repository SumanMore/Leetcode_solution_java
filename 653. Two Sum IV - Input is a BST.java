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
    public boolean findTarget(TreeNode root, int k) 
    {
        
         inorder(root,ob);
         int ar[]=new int[ob.size()];
         for(int i=0;i<ob.size();i++)
         {
           ar[i]=ob.get(i);
         }
         for(int i=0;i<ar.length-1;i++)
         {
             for(int j=i+1;j<ar.length;j++)
             {
                 if(ar[i]+ar[j]==k)
                 {
                     return true;
                 }
             }
         }
         return false;
         
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
