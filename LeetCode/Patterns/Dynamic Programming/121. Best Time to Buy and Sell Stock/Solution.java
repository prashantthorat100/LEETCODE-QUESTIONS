class Solution {
    public int maxProfit(int[] prices) {
        // maxProfit = maxSP -minBP;
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit =0;
        for(int i=0;i<prices.length;i++){
            if(buyingPrice < prices[i]){//profit
                int profit = prices[i] - buyingPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyingPrice = prices[i];
            }

        }
        return maxProfit;

    }
}