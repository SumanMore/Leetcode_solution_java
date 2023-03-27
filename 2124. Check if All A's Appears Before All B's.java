class Solution {
    public boolean checkString(String s) {
        int a=s.indexOf('b');
        if(a==-1)
        {
            return true;
        }
        for(int i=a;i<s.length();i++)
        {
            if(s.charAt(i)!='b')
            {
                return false;
            }
        }
        return true;
    }
}
