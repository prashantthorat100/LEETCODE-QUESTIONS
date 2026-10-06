class Solution {
    public void solve(int[] candidates, int target, int idx,List<List<Integer>> ans ,List<Integer> output){
        // Base case
        if(target==0){
            ans.add(new ArrayList(output));
            return;
        }
        if(idx>= candidates.length){
            return;
        }
        if(target<0){
            return ;
        }

        // recursive case
        output.add(candidates[idx]);
        solve(candidates, target-candidates[idx], idx,ans,output);
        // backtrack
        output.remove(output.size()-1);

        // exclude
        solve(candidates, target,idx+1,ans, output);


    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int idx =0;
        solve(candidates, target, idx, ans, output);
        return ans;
    }
}