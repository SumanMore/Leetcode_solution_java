class Solution {
    public int maximumCount(int[] nums) 
    {
     int neg=0,zero=0,pos=0;
     for(int i =0;i<nums.length;i++)
     {
         if(nums[i]<0)
         {
             neg++;
         }
         else if(nums[i]==0)
         {
          zero++;
         }
     }
      pos=nums.length-neg-zero;
      return Math.max(pos,neg);
        
    }
}
