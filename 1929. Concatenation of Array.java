class Solution {
    public int[] getConcatenation(int[] nums)
     {
        int res[]=new int[nums.length*2];
        if(nums.length<1)
            return nums;
        for(int i=0;i<nums.length*2;i++)
        {
            if(i<nums.length)
            {
                res[i]=nums[i];
            }
            else
            {
                res[i]=nums[i-nums.length];
            }
        }
    return res;
    }
}
