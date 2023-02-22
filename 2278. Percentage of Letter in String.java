class Solution {
    public int percentageLetter(String s, char letter) 
    {  
     int c=0;
        for(int i=0;i<s.length();i++)
        {
          char ch=s.charAt(i);
          if(ch==letter)
          {
              c++;
          }
       }
    return (c*100)/s.length();
    }
}
