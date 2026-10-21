class Solution {
    public int minSubarray(int[] nums, int p) {
        int prefix[] = new int[nums.length];
        int remainder[] = new int[nums.length];

        prefix[0] = nums[0];
        remainder[0] = prefix[0]%p;
        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1]+nums[i];
            remainder[i] = prefix[i]%p;
        }
        int count =0;
        int remain =0;
        for(int i=remainder.length-1;i>=0;i--){
            if(remainder[i]==0){
                return 0;
            }
            while(i>=0){
                remain = nums[i]%p;
                if(remain == remainder[i]){
                    count++;
                }
                i--;
            }
        }
        return count;
    }
}