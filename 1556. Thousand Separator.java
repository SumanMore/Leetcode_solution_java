class Solution {
    public String thousandSeparator(int n) {
        String s=Integer.toString(n);
        if(s.length()<=3)
        {
            return s;
        }
        String s1="";
        int c=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            c++;
            s1=s.charAt(i)+s1;
            if(c==3)
            {
                s1='.'+s1;
                c=0;
            }

        }
        if(s1.charAt(0)=='.')
        {
            s1=s1.substring(1);
        }
        return s1;
        
    }
}
