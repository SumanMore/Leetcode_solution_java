class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int n=s.lastIndexOf(" ");
        s=s.substring(n+1,s.length());
        return s.length();   
    }
}
