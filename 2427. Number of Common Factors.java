class Solution {
    public int commonFactors(int a, int b) {
        int c=0;
        int k=Math.min(a,b);
        for(int i=1;i<=k;i++)
        {
            if(a%i==0 && b %i==0)
            {
                c++;
            }
        }
        return c;
    }
}
