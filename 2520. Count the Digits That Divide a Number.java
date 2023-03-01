class Solution {
    public int countDigits(int num) {
        if(num>0 && num<=9 )
        {
            return 1;
        }
        int d=num;
        int c=0;
        while(d>0)
        {
            int k=d%10;
            if(num%k==0)
            {
            c++;
            }
            d/=10;
        }
        return c;
    }
}
