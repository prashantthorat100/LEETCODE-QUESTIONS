class Solution {
    public int search(int[] nums, int target) {
        int s = 0 ;
        int e = nums.length-1;

        if ( nums.length ==1 && target == nums[s]){
            return s;
        }
        else if ( nums.length ==1 && target != nums[s]){
            return -1;
        }
        
        while(s<e){
            int mid = s + (e-s)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]>target ){
                s = mid ;
            }
            else if( nums[mid]< target){
                e = mid-1;
            }
        }
        return -1;
    }
}