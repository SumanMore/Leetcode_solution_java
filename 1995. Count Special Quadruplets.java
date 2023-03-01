class Solution {
    public int countQuadruplets(int[] arr) {
        if(arr.length<=3)
        {
            return 0;
        }
        int p=0;
        for(int i=0;i<arr.length-3;i++)
        {
            for(int j=i+1;j<arr.length-2;j++)
            {
                for(int k=j+1;k<arr.length-1;k++)
                {
                for(int l=k+1;l<arr.length;l++)
                   {
                        if (arr[i] + arr[j] + arr[k] == arr[l])
                            {
                                 p++;
                            }
                    }
                }
            }
        }
        return p;   
    }
}
