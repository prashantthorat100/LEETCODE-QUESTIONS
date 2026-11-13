class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int product = 1;

        for(int i=0;i<nums.length;i++){
            // product = 1;
            for(int j=i;j<nums.length;j++){
                product = 1;
                for(int p=i;p<=j;p++){
                    product = product * nums[p];
                }
                if(product<k){
                    count ++;
                }
            }
            
        }
        return count;
    }
}