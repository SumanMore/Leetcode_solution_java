class Solution {
    public int findFinalValue(int[] nums, int original) 
    {
       HashSet<Integer> ob= new HashSet<>(nums.length);
       for (int i=0;i< nums.length;i++)
       {
	        ob.add(nums[i]);
       }
    for (int i=0;i<nums.length;i++) 
    {
	    if (!ob.contains(original))
		    break;
	    original = original * 2;
    }
    return original;    
    }
}
