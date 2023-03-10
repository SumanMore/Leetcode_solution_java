class Solution {
    public int xorBeauty(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++)
        {
            xor=xor^nums[i];
        }
        return xor;
        
    }
}
