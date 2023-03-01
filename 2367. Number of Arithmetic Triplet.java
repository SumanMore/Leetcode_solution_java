class Solution {
    public int arithmeticTriplets(int[] arr, int diff) {
        if(arr.length<=2)
        {
            return 0;
        }
        int p=0;
        for(int i=0;i<arr.length-2;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                 if (arr[j] - arr[i] == diff && arr[k] - arr[j] == diff)
                 {
                     p++;
                 }
                }
            }
        }
        return p;   
    }
}
