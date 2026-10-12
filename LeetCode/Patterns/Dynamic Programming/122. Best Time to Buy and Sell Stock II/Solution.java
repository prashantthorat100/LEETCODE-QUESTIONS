class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int cc[] = new int[prices.length];
        for(int i=1; i<prices.length;i++){
            int profit =0;
            if(prices[i-1] < prices[i]){//profit
                profit = prices[i] - prices[i-1];
                maxProfit = maxProfit+profit;
            }
            
            else{
                buyPrice = prices[i];
                
            }
           
            
            
        }
        return maxProfit;
    }
}