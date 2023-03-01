//correct code but TLE
class Solution {
    public int sumFourDivisors(int[] nums) {
        int res=0;
        int res1=0;
        for(int i=0;i<nums.length;i++)
        {
           res = divisor(nums[i]);
           res1+=res;
        }
        return res1;
    }
    int divisor(int num)
    {
        ArrayList<Integer> ob=new ArrayList<Integer>();
        int c=0;
        int k=0;
        int s=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
             ob.add(i);
             c++;
            }
        }
        if(c==4)
        {
          for(int i=0;i<ob.size();i++)
          {
              s=s+ob.get(i);
          }  
        }
        return s;
    }
}
