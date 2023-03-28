class Solution {
    public int findSpecialInteger(int[] arr) {
        int l=(int)(0.25*(arr.length));
        int c=0,res=0;
        for(int i=0;i<arr.length;i++)
        {
            c=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(c>l)
            {
                res= arr[i];
            }
        }
        return res;

        
    }
}
