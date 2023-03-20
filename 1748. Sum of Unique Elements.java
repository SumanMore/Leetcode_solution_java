class Solution {
    public int sumOfUnique(int[] nums) {
        int c=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            c=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    c++;
                }
            }
            if(c==1)
            {
                sum=sum+nums[i];
            }
        }
        return sum;

        
    }
}
