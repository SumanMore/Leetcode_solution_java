class Solution {
    public int thirdMax(int[] nums) {
        int res=0;
       HashSet<Integer> ob=new HashSet<Integer>();
       for(int i=0;i<nums.length;i++)
       {
           ob.add(nums[i]);
       }
       ArrayList<Integer> ob1=new ArrayList<Integer>(ob);
       Collections.sort(ob1);
       if(ob1.size()>=3)
       {
       res = ob1.get(ob1.size()-3);
       }
       else if(ob1.size()>=1 && ob1.size()<=2)
       {
           res=ob1.get(ob1.size()-1);
       }
       return res;
    }
}
