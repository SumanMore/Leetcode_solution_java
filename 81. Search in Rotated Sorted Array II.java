class Solution {
    public boolean search(int[] nums, int target) {
        boolean p=false;
        for( int i=0;i< nums.length;i++)
        {
            if(nums[i]==target)
            {
               p=true;
               break;
            }
        }
        return p;
    }
}
