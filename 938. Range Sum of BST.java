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
    public int rangeSumBST(TreeNode root, int low, int high) 
    {
        int sum=0;
        inorder(root,ob);
        for(int i=0;i<ob.size();i++)
        {
        if(ob.get(i)>=low && ob.get(i)<=high)
        {
          sum=sum+ob.get(i);
        }
        }
        return sum;

        
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
