class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int numOfCoins = 0;
        for(int i=coins.length-1;i>=0;i--){
            while(coins[i]<=amount){
                amount = amount-coins[i];
                numOfCoins++;
            }
        }
        if(amount >0){
            return -1;
        }else{
            return numOfCoins;
        }
    }
}