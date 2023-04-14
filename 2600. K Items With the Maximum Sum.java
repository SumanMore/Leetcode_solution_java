class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) 
    {
        return Math.min(k, numOnes) - Math.max(0, k - numOnes - numZeros);
        
    }
}
