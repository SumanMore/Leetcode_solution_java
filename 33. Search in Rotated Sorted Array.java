class Solution {
    public int search(int[] nums, int target) {
        int p=-1;
        for( int i=0;i< nums.length;i++)
        {
            if(nums[i]==target)
            {
               p=i;
               break;
            }
        }
        return p;
    }
}
