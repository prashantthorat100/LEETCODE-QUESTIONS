class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int max = Integer.MIN_VALUE;

        int lp = 0;
        int rp = nums.length-1;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(j-i >=k){
                    int sum = nums[i]+nums[j];
                    max = Math.max(sum,max);
                }
            }
        }
        return max;
    }
}