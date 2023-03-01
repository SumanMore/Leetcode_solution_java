class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int i=0;
        int j=nums.length-1;
        String s="";
        long sum=0;
        while(i<j)
        {
           s="";
           s=s+nums[i]+nums[j];
           i++;
           j--;
           sum=sum+Integer.parseInt(s);


        }
        if (nums.length%2!=0)
        {
            sum=sum+nums[nums.length/2];
        }
        return sum;
}
}
