class Solution {
    public int balancedStringSplit(String s) {
        if (s.length() == 0)
            return 0;
        int l = 0, r = 0, res= 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == 'L')
                l++;
            else
                r++;
            if (l == r) 
                res++;
        }
        return res;
        
    }
}
