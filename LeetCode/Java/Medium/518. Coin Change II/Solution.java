class Solution {
    public int solve(int amount , int[]coins, int index){
        // base case
        if(amount ==0){
            return 1;
        }
        if(amount<0){
            return 0;
        }
        if(index>=coins.length){
            return 0;
        }

        // recursive case
        int included = solve(amount-coins[index], coins, index);
        int excluded = solve(amount,coins, index+1);
        return included + excluded;
    }
    public int change(int amount, int[] coins) {
        int index =0;
        return solve(amount,coins,index);
    }
}