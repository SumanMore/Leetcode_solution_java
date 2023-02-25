class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> ob=new HashSet<Integer>();
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            c=0;
            for(int j=0;j< nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    c++;
                }
            }
            if(c==2)
            {
                ob.add(nums[i]);
            }
                    }
            ArrayList<Integer> ob1=new ArrayList<Integer>(ob);
            return ob1;


        
    }
}
