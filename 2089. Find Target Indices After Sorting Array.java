class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> ob=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                ob.add(i);
            }
        }
        return ob;
        
    }
}
