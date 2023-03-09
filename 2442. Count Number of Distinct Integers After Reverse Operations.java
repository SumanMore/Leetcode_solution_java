class Solution 
{
    public int countDistinctIntegers(int[] nums) 
    {
        HashSet<Integer> ob = new HashSet<>();
        for (int i : nums) 
        {
            ob.add(i);
            ob.add(reverse(i));
        }
        return ob.size();
    }
    int reverse(int n)
    {
        int rev=0;
        while(n!=0)
        {
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        return rev;
    }
}
