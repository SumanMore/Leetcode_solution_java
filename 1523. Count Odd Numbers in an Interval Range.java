class Solution {
    public int countOdds(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++)
        {
            if(i%2!=0)
            {
                c++;
            }
        }
        return c;
        
    }
}

Optimized solution
class Solution {
    public int countOdds(int low, int high) {
       int range = high-low;
        if(low%2==1 && high%2==1) 
        {
            return (range/2)+1;
        }
        else if (low%2==0 && high%2==0) 
        {
            return (range/2);
        }
        else
        { 
        return (int)Math.ceil((double)range/2);
        }
    }
}
