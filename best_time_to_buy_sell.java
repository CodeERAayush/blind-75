class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int mProfit=Integer.MIN_VALUE;
        
        for(int i=0; i<prices.length;i++){
            minPrice=Math.min(prices[i],minPrice);
            mProfit=Math.max(mProfit,prices[i]-minPrice);
        }
        return mProfit;
    }
}