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
    public int getMinimumDifference(TreeNode root) {
        inorder(root,ob);
        int min=ob.get(ob.size()-1);
        int ar[]=new int[ob.size()];
        for(int i=0;i<ob.size();i++)
        {
            ar[i]=ob.get(i);
        }
        for(int i=0;i<ar.length-1;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                min=Math.min(Math.abs(ar[i]-ar[j]),min);
            }
        }
        
        return min;

        
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
