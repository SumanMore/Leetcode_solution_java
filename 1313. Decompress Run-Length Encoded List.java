class Solution {
    public int[] decompressRLElist(int[] nums) {
       
        ArrayList<Integer> ob=new ArrayList<Integer>();
        int j=0;
        for(int i=0;i<nums.length;)
        {
            for(int k=0;k<nums[i];k++)
            {
                ob.add(nums[i+1]);
            }
            i=i+2;
        }
         int ar[]=new int[ob.size()];
        for(int p=0;p<ob.size();p++)
        {
            ar[p]=ob.get(p);
        }
        return ar;
    }
}
