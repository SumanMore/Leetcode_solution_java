class Solution {
    public String restoreString(String s, int[] indices) {
        char ch[]=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
         char chr=s.charAt(i);
         ch[indices[i]]=chr;
        }
        String res=new String(ch);
        return res;
    }
}
