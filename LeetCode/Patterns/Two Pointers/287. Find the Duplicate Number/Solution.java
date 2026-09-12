class Solution {
    public int findDuplicate(int[] nums) {
        
        int s =1;
        int e = nums.length-1;
        int mid =0;
        int count =0;
        while(s<e){
            mid = s+(e-s)/2;
            count =0;
            
            for(int i=0;i<nums.length;i++){
                if(nums[i]<=mid){
                    count++;
                }
            }
            if(count>mid){
                e = mid;
            }
            else{
                s = mid +1;
            }
        }
        return s;
    }
}