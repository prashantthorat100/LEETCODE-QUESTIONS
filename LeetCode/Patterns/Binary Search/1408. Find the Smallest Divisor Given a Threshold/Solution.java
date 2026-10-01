class Solution {
    public boolean possible(int[]nums, int threshold, int divisor){
        int result = 0;
        for(int i=0;i<nums.length;i++){
            result += Math.ceil((double)nums[i]/divisor);
        }
        return result<=threshold;

    }
    public int smallestDivisor(int[] nums, int threshold) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            mini = Math.min(mini,nums[i]);
            maxi = Math.max(maxi,nums[i]);
        }

        while(mini<=maxi){
            int mid = mini + (maxi -mini)/2;
            if(possible(nums,threshold,mid)){
                maxi = mid-1;
            }
            else {
                mini = mid + 1;
            }
        }
        return mini;
    }

}