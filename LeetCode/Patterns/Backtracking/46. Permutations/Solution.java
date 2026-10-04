class Solution {

    public void findPermutations(
        int[] nums,
        List<Integer> ans,
        List<List<Integer>> result) {

    // Base case
    if (nums.length == 0) {
        result.add(new ArrayList<>(ans));
        return;
    }

    // Recursive case
    for (int i = 0; i < nums.length; i++) {

        // Pick
        int curr = nums[i];

        // Remove curr
        int[] remaining = new int[nums.length - 1];

        int index = 0;

        for (int j = 0; j < nums.length; j++) {
            if (j != i) {
                remaining[index++] = nums[j];
            }
        }

        // Add
        ans.add(curr);

        // Recurse
        findPermutations(remaining, ans, result);

        // Backtrack
        ans.remove(ans.size() - 1);
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        findPermutations(nums, new ArrayList<>(), result);

        return result;
    }


}