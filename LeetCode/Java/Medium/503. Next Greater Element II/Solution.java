class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[nums.length];
        int N = nums.length;
        for(int i= (2*N -1);i>=0;i--){
            // 1 while
            while(!s.isEmpty() && nums[s.peek()]<=nums[i%N]){
                s.pop();
            }

            // 2 ifelse
            if(s.isEmpty()){
                nxtGreater[i%N] = -1;
            }else{
                nxtGreater[i%N] = nums[s.peek()];
            }

            // 3 push in s
            s.push(i%N);
        }
        return nxtGreater;
    }

}