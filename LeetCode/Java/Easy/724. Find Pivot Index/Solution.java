class Solution {
    public int pivotIndex(int[] nums) {
        int prefSum[] = new int[nums.length];
        int suffSum[] = new int[nums.length];
        prefSum[0] = 0;
        suffSum[nums.length-1] =0;
        for(int i=1;i<prefSum.length;i++){
            prefSum[i] = prefSum[i-1]+ nums[i-1];
        }
        for(int i=suffSum.length-2;i>=0;i--){
            suffSum[i] = suffSum[i+1]+nums[i+1];
        }

        // int idx = -1;
        for(int i=0;i<prefSum.length;i++){
            if(prefSum[i]==suffSum[i]){
                return i;
            }
        }

        return -1;

    }
}