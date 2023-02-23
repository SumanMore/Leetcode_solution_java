class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> ob=new ArrayList<Integer>();
        for(int i=0;i<digits.length;i++)
        {
            ob.add(digits[i]);
        }
        int n=ob.size()-1;
        ob.set(n,ob.get(n)+1);
        for(int i=n;i>0 && ob.get(i)==10;i--)
        {   
            ob.set(i,0);
            ob.set(i - 1, ob.get(i - 1) + 1);
        }
        if (ob.get(0) == 10) 
        {
            ob.set (0 , 0) ;
            ob.add (0 , 1);
        }
        int arr[]=new int[ob.size()];
      for(int i=0;i<ob.size();i++)
    {
        arr[i]=ob.get(i);
    }
    return arr;
    }
}
