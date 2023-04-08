class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String s1="";
        for(String i:words)
        {
            s1=s1+i;
            if(s1.equals(s))
            {
            return true;
            }
        }
        return false;
        
    }
}
