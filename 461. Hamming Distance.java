class Solution {
    public int hammingDistance(int x, int y) {
        String s=Integer.toBinaryString(x^y);
	    int c=0;
	    for(int i=0;i<s.length();i++)
        {
	     if(s.charAt(i)=='1')
         {
		  c++;
         }
        }
        return c;
    }
}
        
   
