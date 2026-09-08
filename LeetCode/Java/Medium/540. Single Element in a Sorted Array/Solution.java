class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s = 0, e=nums.length-1;
        int mid =0;

        while(s<e){
            mid = s + (e-s)/2;
            if(mid%2!=0){
                mid--;
            }
            if(nums[mid]==nums[mid+1]){
                s = mid +2;
            }
            else{
                e = mid;
            }
        }
        return nums[e];
    }
}