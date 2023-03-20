class Solution {
    public int dominantIndex(int[] nums) 
    {
        int max=0;
        int c=0;
        int res=-1;
        for(int i=0;i<nums.length;i++)
        {
           max=Math.max(nums[i],max);
        }
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]==max)
           {
               res=i;
           }
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]*2<=max)
            {
                c++;
            }
        }
        if(c==nums.length-1)
        {
            return res;
        }
        return -1;
        
    }
}
