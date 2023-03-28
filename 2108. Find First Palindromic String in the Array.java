class Solution {
    public String firstPalindrome(String[] words) {
        String res="";
        for(int i=0;i<words.length;i++)
        {
            String s=words[i];
            boolean check=palindrome(s);
            if(check==true)
            {
                res=s;
                break;
            }    
        }
        return res;
    }
      boolean  palindrome(String s) 
      {
          int i=0,j=s.length()-1;
            while(i<j)
            {
                if(s.charAt(i)!=s.charAt(j))
                {
                    return false;
                }
                i++;j--;
            }
            return true;
      }
}
