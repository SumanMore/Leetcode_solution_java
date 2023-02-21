class Solution {
    public int missingNumber(int[] nums) {
       int sum = ((nums.length) * (nums.length + 1)) / 2;
       int sum1=0;
        for (int i = 0; i < nums.length; i++)
        {
            sum1+= nums[i];
        }
        return sum-sum1; 
    }
}
