class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int leftsum[]=new int[nums.length];
        int rightsum[]=new int[nums.length];
        leftsum[0]=0;
        rightsum[nums.length-1]=0;
        if(nums.length>1)
        {
            leftsum[1]=nums[0];
            rightsum[nums.length-2]=nums[nums.length-1];
        }
        for(int i=2;i<nums.length;i++)
        {
            leftsum[i]=leftsum[i-1]+nums[i-1];
        }
        for(int i= nums.length-3;i>=0;i--)
        {
            rightsum[i]=rightsum[i+1]+nums[i+1];
        }
        for(int i=0;i<nums.length;i++)
        {
            leftsum[i]=Math.abs(leftsum[i]-rightsum[i]);
        }
        return leftsum;
    }
}
