class Solution {
    public int[] evenOddBit(int n) {
        String a = Integer.toBinaryString(n);
        int even=0,odd=0;
        String rev="";
        for(int i=a.length()-1;i>=0;i--)
        {
            rev=rev+a.charAt(i);
        }
        for(int k=0;k<rev.length();k++)
        {
            if(rev.charAt(k)=='1'&& k%2==0)
            {
                even++;
            }
            else if(rev.charAt(k)=='1'&& k%2!=0)
            {
                odd++;
            }
    
        }
        int ar[]=new int[2];
        ar[0]=even;
        ar[1]=odd;
        return ar;
        
    }
}
