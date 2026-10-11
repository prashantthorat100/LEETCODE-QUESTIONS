class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sumOfSq = 0;
        int sq = 0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                sq = nums[i-1]*nums[i-1];
                sumOfSq+= sq;
            }
        }
        return sumOfSq;
    }
}