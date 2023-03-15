class Solution {
    public int[] applyOperations(int[] nums) {
        int ar[]=new int[nums.length];
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        ArrayList<Integer> ob=new ArrayList<Integer>();
        ArrayList<Integer> ob1=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                ob.add(0);
            }
            else
            {
                ob1.add(nums[i]);
            }
        }
        ob1.addAll(ob);
        for(int i=0;i<nums.length;i++)
        {
            ar[i]=ob1.get(i);
        }
        return ar;
    }
}
