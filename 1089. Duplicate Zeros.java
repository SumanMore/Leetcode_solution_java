class Solution {
    public void duplicateZeros(int[] arr) 
    {
        ArrayList<Integer> al=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                al.add(0);
                al.add(0);
            }
            else al.add(arr[i]);
        }
        for(int i=0;i<n;i++)
            arr[i]=al.get(i);
        
    }
}
