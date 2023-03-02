class Solution {
    public int[] countBits(int n) {
        int ar[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int c=0;
            String s=Integer.toBinaryString(i);
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)=='1')
                {
                    c++;
                }
            }
            ar[i]=c;
        }
        return ar;
        
    }
}
