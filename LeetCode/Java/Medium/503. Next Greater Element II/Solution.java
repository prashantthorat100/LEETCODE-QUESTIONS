class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] nGE = new int[nums.length];
        Stack<Integer> s = new Stack<>();
        int N = nums.length;
        for(int i=2*N -1 ; i>=0;i--){
            while(!s.isEmpty() && nums[s.peek()] <= nums[i%N]){
                s.pop();
            }
            if(s.isEmpty()){
                nGE[i%N] = -1;
            }else{
                nGE[i%N] = nums[s.peek()];
            }
            s.push(i%N);
        }
        return nGE;
    }
}