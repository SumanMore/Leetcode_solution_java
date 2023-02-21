class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        ArrayList<Integer> ob=new ArrayList<Integer>();
        double med=0;
        for(int i=0;i<nums1.length;i++)
        {
            ob.add(nums1[i]);
        }
         for(int i=0;i<nums2.length;i++)
        {
            ob.add(nums2[i]);
        }
        Collections.sort(ob);
        int l=ob.size();
        if(l%2==0)
        {
           med= ((ob.get((l-1)/2))+(ob.get((l+1)/2)))/2.0;
        }
        else
        {
          med=ob.get(l/2);  
        }
        return med;

    }
}
