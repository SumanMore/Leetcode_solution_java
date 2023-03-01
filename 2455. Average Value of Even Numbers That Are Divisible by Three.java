class Solution {
    public int averageValue(int[] nums) {
        int j=0,sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%3==0 && nums[i]%2==0)
            {
            sum+=nums[i];
            j++;
            }
        }
        if (j==0)
        {
            return 0;
        }
        return Math.round(sum/j);
    }
}
