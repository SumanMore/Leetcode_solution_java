class Solution {
    public String reverseOnlyLetters(String s) 
    {
       String res="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A'&& ch<='Z')
            {
                res=ch+res;
            }
        }
        String r="";
        int l=0;
         for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A'&& ch<='Z')
            {
                r=r+res.charAt(l);
                l++;
            }
            else 
            {
                r=r+ch;
            }
	}
    return r;
    }
}
