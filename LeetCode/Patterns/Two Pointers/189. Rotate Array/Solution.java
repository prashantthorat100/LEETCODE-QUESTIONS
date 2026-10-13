class Solution {

    public void reverseArr(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        // Reverse entire array
        reverseArr(nums, 0, nums.length - 1);

        // Reverse first k elements
        reverseArr(nums, 0, k - 1);

        // Reverse remaining elements
        reverseArr(nums, k, nums.length - 1);
    }
}