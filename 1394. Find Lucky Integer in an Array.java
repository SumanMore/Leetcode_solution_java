class Solution {
    public int findLucky(int[] arr) 
    {  
    ArrayList<Integer> ob=new ArrayList<Integer>();
    int c=0;
    int j=0;
    int res=-1;
        for(int i=0;i<arr.length;i++)
        {
            c=0;
            for(int k=0;k<arr.length;k++)
            {
                if(arr[i]==arr[k])
                {
                    c++;
                }
            }
            if(c==arr[i])
            {
                ob.add(c);
            }

        }
        Collections.sort(ob);
        if(ob.size()>0)
        {
        res=ob.get(ob.size()-1);
        }
        return res;
    }
}
