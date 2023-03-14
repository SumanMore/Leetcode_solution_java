class Solution {
    public boolean digitCount(String num) {
       String s="";
        int c=0;
        for(int i=0;i<num.length();i++)
        {
            c=0;
            for(int j=0;j<num.length();j++)
            {
                int c1=Character.getNumericValue(num.charAt(j));
                if(i==c1)
                {
                  c++;
                }
            }
            s=s+c;
        }
        return s.equals(num);
    }
}
