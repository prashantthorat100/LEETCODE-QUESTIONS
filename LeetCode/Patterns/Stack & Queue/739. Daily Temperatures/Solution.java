class Solution {
    public int[] dailyTemperatures(int[] tempt) {
        Stack<Integer> s = new Stack<>();
        int nge[] = new int[tempt.length];

        for(int i=tempt.length-1;i>=0;i--){
            while(!s.isEmpty() && tempt[s.peek()]<=tempt[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nge[i] = 0;
            }else{
                nge[i] = s.peek() - i;
            }

            s.push(i);
        }
        
        return nge;
    }
}