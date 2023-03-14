class Solution {
    public boolean detectCapitalUse(String word) 
    {
        int c=0,l=0;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)>='A'&& word.charAt(i)<='Z')
            {
                c++;
            }
            if(word.charAt(i)>='a'&& word.charAt(i)<='z')
            {
                l++;
            }

        }
        if(c==word.length())
        {
            return true;
        }
        if(l==word.length())
        {
            return true;
        }
        if(word.charAt(0)>='A'&& word.charAt(0)<='Z' && l==(word.length()-1))
        {
            return true;
        }
        return false;

}
}
