class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='1')
            {
                ch[i]='0';
            }
            else
            {
                ch[i]='1';
            }
        }
        String res=new String(ch);
        int r=Integer.parseInt(res,2);
        return r;
    }
}
