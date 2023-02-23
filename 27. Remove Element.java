class Solution {
    public int removeElement(int[] nums, int val) {
        int val_count=0;
        for(int i=0;i<nums.length;i++)
        {
         if(nums[i]!=val)
         {
          nums[val_count]=nums[i];
          val_count++;
        }
        }
        return val_count;
    }
}
