class Solution {
    public int numberOfSteps(int num) 
    {
        int d=num;
        int c=0;
        while(d!=0)
        {
            if(d%2==0)
            {
              d=d/2;
              c++;
            }
            else
            {
                d=d-1;
                c++;
            }
        }
        return c;
        
    }
}
