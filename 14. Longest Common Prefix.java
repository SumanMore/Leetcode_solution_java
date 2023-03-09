class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        Arrays.sort(strs);
        String fi=strs[0];
        String li=strs[strs.length-1];
        int index=0;
        while(index<fi.length())
        {
            if(fi.charAt(index)==li.charAt(index))
            {
                index++;
            }
            else
            {
                break;
            }
        }
       if(index==0)
       {
           return "";
       }
       return fi.substring(0,index);
    }
}
