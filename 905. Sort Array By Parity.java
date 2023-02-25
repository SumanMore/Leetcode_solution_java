class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> ob=new ArrayList<Integer>();
         ArrayList<Integer> ob1=new ArrayList<Integer>();
         int res[]=new int[nums.length];
         for(int i=0;i<nums.length;i++)
         {
             if(nums[i]%2==0)
             {
                 ob.add(nums[i]);
             }
             else
             {
                 ob1.add(nums[i]);
             }
         }
         ob.addAll(ob1);
         for(int i=0;i<ob.size();i++)
         {
             res[i]=ob.get(i);
         }
         return res;

    }
}
