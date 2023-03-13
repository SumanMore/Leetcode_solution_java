class Solution {
    public List<Integer> majorityElement(int[] nums) {
       HashSet<Integer> ob=new HashSet<Integer>();
       int k=(int)Math.floor(nums.length/3);
        int c=0;
        
        for(int i=0;i<nums.length;i++)
        {
            c=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    c++;
                }
            }
            if(c>k)
            {
                ob.add(nums[i]);
            }
        }
        ArrayList<Integer> res=new ArrayList<Integer>(ob);
        return res;

    }
}
