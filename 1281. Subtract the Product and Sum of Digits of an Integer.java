class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,p=1;
        while(n!=0)
        {
            int r=n%10;
            sum=sum+r;
            p=p*r;
            n/=10;
        }
        return p-sum;
    }
}
