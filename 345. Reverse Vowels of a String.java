class Solution {
    public String reverseVowels(String s) 
    {
        if(s.equals(null))
        {
            return s;
        }
        char ch[]=s.toCharArray();
        String s1="";
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='o'|| ch[i]=='u'||ch[i]=='i'||ch[i]=='A'|| ch[i]=='E'|| ch[i]=='O'|| ch[i]=='U'||ch[i]=='I')
            {
               s1=ch[i]+s1;
            }
        }
        int l=0;
        for(int i=0;i<ch.length;i++)
        {
         if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='o'|| ch[i]=='u'||ch[i]=='i'||ch[i]=='A'|| ch[i]=='E'|| ch[i]=='O'|| ch[i]=='U'||ch[i]=='I')
         {
          ch[i]=s1.charAt(l);
          l++;
         }
        }
        String ans=new String(ch);
        return ans;
       
    }
}
