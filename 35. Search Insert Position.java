class Solution {
    public int searchInsert(int[] nums, int target) 
    {
       int res=0;

       if(nums[nums.length-1]<target)
       {
           res= nums.length;
       }
       else if(nums[nums.length-1]==target)
       {
           res= nums.length-1;
       }
       else
       {
           for(int i=0;i<nums.length-1;i++)
           {
               if(target>nums[i] && target<nums[i+1])
               {
                   res=i+1;
                   
               }
               if(target==nums[i])
               {
                   res=i;
                   
               }
           }
       }
       return res;

    }
}
