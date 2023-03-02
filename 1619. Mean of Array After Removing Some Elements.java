class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int startindex=(int)(0.05*arr.length);
        int endindex= arr.length-startindex;
        int c=0,s=0;
        for(int i=startindex;i<endindex;i++)
        {
         s=s+arr[i];
         c++;
        }
        return (double)s/c;
    }
}
