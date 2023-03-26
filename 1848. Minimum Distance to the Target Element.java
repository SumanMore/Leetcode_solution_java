class Solution {
    public int getMinDistance(int[] num, int target, int start) 
    {
       int s = Integer.MAX_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) 
        {
            if (num[i] == target) 
            {
                s = i;
            }
            min = Math.min(min, Math.abs(s - start));
        }
        return min;
    }
}
