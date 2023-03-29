class Solution {
    public int findNumbers(int[] nums) 
    {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            String s=""+nums[i];
            if(s.length()%2==0)
            c++;
        }
        return c;
        
    }
}
