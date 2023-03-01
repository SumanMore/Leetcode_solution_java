class Solution {
    public int differenceOfSum(int[] nums) {
        String s="";
        for(int i=0;i<nums.length;i++)
        {
          s=s+nums[i];
        }
        int sum1=0;
        for(int i=0;i<nums.length;i++)
        {
          sum1=sum1+nums[i];
        }
        int sum2=0;
        for(int i=0;i<s.length();i++)
        {
          sum2=sum2+Character.getNumericValue(s.charAt(i));
        }
        return Math.abs(sum2-sum1);
    }
}
