class Solution {
    public int maxProfit(int[] prices) {
        int  minPrice = Integer.MAX_VALUE ;
        int maxProfit=0;
        for(int p=0;p<prices.length;p++)
        {
            minPrice = Math.min(prices[p],minPrice);
            maxProfit = Math.max(maxProfit,prices[p]-minPrice);
        }
        return maxProfit;
    }
}
