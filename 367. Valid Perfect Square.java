class Solution {
    public boolean isPerfectSquare(int num) {
        int res=(int)(Math.sqrt(num));
        if(res*res == num)
        {
            return true;
        }
        return false;
        
    }
}
