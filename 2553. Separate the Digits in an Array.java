class Solution {
    public int[] separateDigits(int[] nums) {
        String s="";
        for(int i=0;i<nums.length;i++)
        {
            s=s+nums[i];
        }
         int ar[]=new int[s.length()];
         for(int i=0;i<s.length();i++)
         {
             ar[i]=Character.getNumericValue(s.charAt(i));
         }
         return ar;
        
        
    }
}
