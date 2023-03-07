class Solution {
    public int[] runningSum(int[] nums) 
    {
        int ar[]=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            ar[i]=sum;
        }
        return ar;
        
    }
}
