class Solution {
    public int canBeTypedWords(String text, String brokenLetters)
    {
        String[] s=text.split("\\s");
        int c=0;
        for(String s1:s)
        {
            boolean b=true;
            for(int i=0;i<brokenLetters.length();i++)
            {
                if(s1.indexOf(brokenLetters.charAt(i))!=-1)
                {
                    b=false;
                    break;
                }
            }
            if(b)
            c++;
        }
        return c;
    }
}
