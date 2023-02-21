class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        ArrayList<Integer> ob=new ArrayList<Integer>();
        ArrayList<Integer> ob1=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                ob1.add(0);
            }
            else
            {
                ob.add(nums[i]);
            }
        }
        ob.addAll(ob1);
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=ob.get(i);
        }
    }
}
