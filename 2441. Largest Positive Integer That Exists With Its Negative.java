class Solution {
    public int findMaxK(int[] nums) {
        ArrayList<Integer> ob=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==Math.abs(nums[j])&& nums[j]<0 && i!=j)
                {
                    ob.add(nums[i]);
                }
            }
        }
        Collections.sort(ob);
        if(ob.size()>=1)
        {
        return ob.get(ob.size()-1);
        }
        return -1;
        
    }
}
