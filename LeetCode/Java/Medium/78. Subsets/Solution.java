class Solution {
     public static void findSubsets(
            int[] nums,
            List<Integer> ans,
            List<List<Integer>> result,
            int i) {

        // Base case
        if (i == nums.length) {
            result.add(new ArrayList<>(ans));
            return;
        }

        // Yes choice
        ans.add(nums[i]);
        findSubsets(nums, ans, result, i + 1);

        // Undo Yes choice
        ans.remove(ans.size() - 1);

        // No choice
        findSubsets(nums, ans, result, i + 1);
    }

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        findSubsets(nums, new ArrayList<>(), result, 0);

        return result;
    }
}