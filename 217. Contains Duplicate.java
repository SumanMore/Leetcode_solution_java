class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> ob=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            ob.add(nums[i]);
        }
        if(ob.size()==nums.length)
        {
            return false;
        }
        return true;
    }
}
