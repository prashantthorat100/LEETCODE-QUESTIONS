class Solution {
    public int maxSum(int[] nums) {
        
        
        int maxNum = -1;
        for(int i=0;i<nums.length;i++){
            int numI = nums[i];
            int maxi = -1;
            int maxj = -1;
            // maxNum = -1;
            
            while(numI>0){
                int ld = numI%10;
                if(ld>maxi){
                    maxi = ld;
                }
                numI/=10;
            }
            for(int j=i+1;j<nums.length;j++){
                maxj =-1;
                // maxNum = -1;
                int numJ = nums[j];
                while(numJ>0){
                    int ld1 = numJ%10;
                    if(ld1>maxj){
                        maxj = ld1;
                    }
                    numJ/=10;
                }
                if(maxi ==maxj){
                    maxNum = Math.max(maxNum, nums[i]+nums[j]);
                }
            }
        }
        return maxNum;
    }
}