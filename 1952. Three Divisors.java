class Solution {
    public boolean isThree(int n) {
       boolean res=false;
        res=divisor(n);
        return res;
    }
    boolean divisor(int num)
    {
        int c=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
             c++;
            }
        }
        if(c==3)
        {
            return true;
        }
        return false;
    }
}
