class Solution {
    public String reversePrefix(String word, char ch) {
        int l=word.indexOf(ch);
        String revword="";
        for(int i=0;i<=l;i++)
        {
            revword=word.charAt(i)+revword;
        }
        word=word.substring(l+1,word.length());
        return revword+word;
    }
}
