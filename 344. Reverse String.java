class Solution {
    public void reverseString(char[] s) {
        char[] s1=new char[s.length];
        for(int i=0;i<s.length;i++)
        {
            s1[i]=s[s.length-1-i];
        }
        for(int i=0;i<s.length;i++)
        {
            s[i]=s1[i];
        }
    }
}
