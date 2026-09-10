class Solution {
    public int findMin(int[] nums) {
        int s = 0;
        int e = nums.length-1;

        
        if(nums.length ==1){
            return nums[0];
        }
        else if(nums[s]>nums[s+1]){
            return nums[s+1];
        }
        else if(nums[s]<nums[e]){
            return nums[s];
        }
        else if( nums[e-1]>nums[e]){
            return nums[e];
        }
        s++;
        e--;
        while(s<e){
            int mid = s + (e-s)/2;

            if(nums[mid]> nums[mid+1]){
                return nums[mid+1];
            }
            // else if(nums[s])
        }

        return nums[s];
    }
}