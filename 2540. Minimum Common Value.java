class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
       TreeSet<Integer> ob1=new TreeSet<Integer>();
       TreeSet<Integer> ob2=new TreeSet<Integer>();
       for(int i=0;i<nums1.length;i++)
       {
           ob1.add(nums1[i]);
       }
       for(int i=0;i<nums2.length;i++)
       {
           ob2.add(nums2[i]);
       }
       for(Integer res :ob1)
       {
            if(ob2.contains(res))
            {
                return res;
            }
        }
       return -1;
    }
}
