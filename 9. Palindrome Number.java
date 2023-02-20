class Solution {
    public boolean isPalindrome(int x) {
       String s=String.valueOf(x);
       int i = 0;                     
       int j = s.length() - 1;       
        while(i <= j)                   
        {
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;                                
            j--;                               
        }
       return true;
    }
}


class Solution {
    public boolean isPalindrome(int x) {
       String s= Integer.toString(x);
        int i=0;
        boolean ans=false;
        if(s.charAt(0)=='-')
        {
         i=1;
         return ans;
        }
        String res="";
        for(int k=s.length()-1;k>=0;k--)
        {
          res=res+s.charAt(k);
        }
        if(res.equals(s))
        {
            ans=true;
        }
    return ans;
    }
}
