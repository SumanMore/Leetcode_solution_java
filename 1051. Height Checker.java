class Solution {
    public int heightChecker(int[] heights)
    {
        int ar[]=Arrays.copyOf(heights,heights.length);
        int c=0;
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++)
        {
            if(ar[i]!=heights[i])
            {
                c++;
            }
        }
        return c;
        
    }
}
