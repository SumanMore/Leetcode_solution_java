class Solution {
    public int countEven(int num) {
        int c=0;
        for(int i=2;i<=num;i++)
        {
            if(i<9 && i%2==0)
            {
              c++;
            }
            else
            {
                int d=i;
                int sum=0;
                while(d>0)
                {
                int r= d%10;
                sum=sum+r;
                d/=10;
                }
                if(sum%2==0)
                {
                    c++;
                }
            }
        }
        return c;
    }
}
