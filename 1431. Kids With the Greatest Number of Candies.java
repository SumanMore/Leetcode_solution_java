class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ob=new ArrayList<Boolean>();
        int ar[]=new int[candies.length];
        for(int i=0;i<candies.length;i++)
        {
            ar[i]=candies[i];
        }
        Arrays.sort(ar);
        int max=ar[ar.length-1];
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=max)
            {
                ob.add(true);
            }
            else
            {
                ob.add(false);
            }
        }
        return ob;
    }
}
