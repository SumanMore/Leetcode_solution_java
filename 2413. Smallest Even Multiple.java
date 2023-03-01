class Solution {
    public int smallestEvenMultiple(int n) {
        int ans=0;
        if(n==1)
        {
            return 2;
        }
        for(int i=1;i<=n;i++)
        {
            if((n*i)%2==0 && (n*i)%n==0)
            {
                ans=n*i;
                break;
            }
        }
        return ans;
    }
}
