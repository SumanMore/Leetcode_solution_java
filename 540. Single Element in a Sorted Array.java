class Solution {
    public int singleNonDuplicate(int[] nums) {
        int res=-1;
        if(nums.length==1)
        {
            res=nums[0];
        }
        
        else if(nums[nums.length-1]!=nums[nums.length-2])
        {
           res = nums[nums.length-1];
        }
        for(int i=0;i<nums.length-1;i+=2)
        {
          if(nums[i]!=nums[i+1])
          {
              res= nums[i];
              break;
          }
        }
         return res;
        
    }
}
