class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int c=0;
        char ch='a';
        int max=-1;
        for(int i=0;i<s.length();i++)
        {
            c=0;
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    c++;
                }
            }
            if(c>=2)
            {
            ch=s.charAt(i);
            int f1=s.indexOf(ch);
            int l1=s.lastIndexOf(ch);
            max=Math.max(max,l1-f1-1);
          }
        }
        return max;
    }
}
