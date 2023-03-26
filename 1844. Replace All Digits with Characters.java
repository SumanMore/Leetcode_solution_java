class Solution {
    public String replaceDigits(String s) {
        String str="";
        for(int i=0;i<s.length()-1;i++)
        {
            if(Character.isDigit(s.charAt(i+1)))
            {
                str=str+s.charAt(i)+(char)(s.charAt(i)+Integer.parseInt(s.charAt(i+1)+""));
                i++;
            }
        }
        if(Character.isLetter(s.charAt(s.length()-1)))
        {
        str=str+s.charAt(s.length()-1);
        }
        return str;
    }
}
