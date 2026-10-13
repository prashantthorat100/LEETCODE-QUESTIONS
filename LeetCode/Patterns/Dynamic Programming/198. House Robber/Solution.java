class Solution {
    static int solve(int[] nums, int idx){
        // base case
        if(idx >= nums.length){
            return 0;
        }

        // recursive case
        int include= nums[idx] + solve(nums, idx+2);
        int exclude = solve(nums, idx+1);

        return Math.max(include, exclude);
    }
    public int rob(int[] nums) {
        return solve(nums, 0);
    }
}