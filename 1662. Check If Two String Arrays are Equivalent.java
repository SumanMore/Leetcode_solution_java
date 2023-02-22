class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String ob1="",ob2="";
        for(int i=0;i<word1.length;i++)
        {
            ob1=ob1+word1[i];
        }
        for(int i=0;i<word2.length;i++)
        {
            ob2=ob2+word2[i];
        }
        if(ob1.equals(ob2))
        {
            return true;
        }
        return false;

    }
}
