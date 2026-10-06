class Solution {
    public int minStartValue(int[] nums) {
        int prefixSum[] = new int[nums.length];
        prefixSum[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefixSum[i]= prefixSum[i-1]+nums[i];
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<prefixSum.length;i++){
            min = Math.min(min,prefixSum[i]);
        }

        if(min==1 || min==0){
            return 1;
        }
        else{
            
                return 1-min;
            
           
        }
    }
}