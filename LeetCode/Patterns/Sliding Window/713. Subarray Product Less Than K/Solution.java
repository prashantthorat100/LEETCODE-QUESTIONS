class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {

                long product = 1;

                for (int p = i; p <= j; p++) {
                    product *= nums[p];
                }

                if (product < k) {
                    count++;
                }
            }
        }

        return count;
    }
}