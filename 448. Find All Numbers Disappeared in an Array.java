class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int val : nums) {
            set.add(val);
        }
        ArrayList<Integer> ob= new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) 
        {
            if (!set.contains(i)) 
            {
                ob.add(i);
            }
        }
        return ob;
    }
}
