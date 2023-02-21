class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        return nums;
    }
}
