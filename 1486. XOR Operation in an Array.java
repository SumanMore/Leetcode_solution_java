class Solution {
    public int xorOperation(int n, int start) {
        int ar[]=new int[n];
        int res=0;
        for(int i=0;i<n;i++)
        {
            ar[i]=start+2*i;
            res=res^ar[i];
        }
        return res;     
    }
}
