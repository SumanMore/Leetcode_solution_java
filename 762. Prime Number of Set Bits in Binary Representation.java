class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c=0,c1=0;
        int res=0;
        for(int i=left;i<=right;i++)
        {
            c=0;
            String s=Integer.toBinaryString(i);
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)=='1')
                {
                    c++;
                }
            }
            c1=primecheck(c);
            if(c1==1)
            {
                res++;
            }
        }
        return res;
    }
        int primecheck(int n)
        {
            if (n==0 || n==1) 
            {
                return 0;
            }
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    return 0;
                }
            }
        return 1;
        }
    }
