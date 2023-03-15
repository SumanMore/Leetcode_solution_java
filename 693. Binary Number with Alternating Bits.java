class Solution {
    public boolean hasAlternatingBits(int n) {
        String s=Integer.toString(n,2);
        for(int i=0;i<s.length();i++)
        {
            if (i%2==0 && s.charAt(i)!='1' )
            {
                return false;
            }
             if (i%2!=0 && s.charAt(i)!='0' )
             {
                 return false;
             }
        }
        return true;
    }
}
