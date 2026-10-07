class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        int maxLeft = nums[0];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(j-i >=k){
        //             int sum = nums[i]+nums[j];
        //             max = Math.max(sum,max);
        //         }
        //     }
        // }

        for(int j=k;j<nums.length;j++){
            maxLeft = Math.max(maxLeft, nums[j - k]);
            maxSum = Math.max(maxSum, maxLeft + nums[j]);
        }
        
        return maxSum;
    }
}