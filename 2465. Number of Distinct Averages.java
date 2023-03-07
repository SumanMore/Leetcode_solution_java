class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
		    HashSet<Double> ob=new HashSet<Double>();
        for(int i=0;i<nums.length/2;i++)
        {
            ob.add((double)(nums[i]+nums[nums.length-i-1])/2);
        }
        return ob.size();
    }
}
