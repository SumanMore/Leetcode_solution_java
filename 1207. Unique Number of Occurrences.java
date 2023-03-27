class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashSet<Integer> ob= new HashSet<Integer>();
        for(int a:arr)
        {
            ob.add(a);
        }
        int c=0;
        ArrayList<Integer> ob1=new ArrayList<Integer>();
        for(int i:ob)
        {
            c=0;
            for(int j=0;j<arr.length;j++)
            {
                if(i==arr[j])
                {
                    c++;
                }
            }
            ob1.add(c);
        }
         HashSet<Integer> ob2=new HashSet<Integer>(ob1);
       if(ob1.size()==ob2.size())
       {
           return true;
       }
       return false;
        
    }
}
