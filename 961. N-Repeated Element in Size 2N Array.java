class Solution {
    public int repeatedNTimes(int[] nums) 
    {
        HashSet<Integer>ob=new HashSet<>();
        for(int n:nums){
            if(!ob.contains(n))
            {
                ob.add(n);
            }
            else
            {
                return n;
            }
        }
        return 0;
    }
}
