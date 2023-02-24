class Solution {
    public int getSum(int a, int b) {
       return a==0 ? a^b : getSum((a&b)<<1,a^b);
    }
}
