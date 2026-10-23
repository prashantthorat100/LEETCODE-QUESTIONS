import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        int i;

        // Process the first window
        for (i = 0; i < k; i++) {
            while (!deque.isEmpty() &&
                   nums[i] >= nums[deque.peekLast()]) {
                deque.removeLast();
            }

            deque.addLast(i);
        }

        int index = 0;

        // Process the remaining windows
        for (; i < n; i++) {
            result[index++] = nums[deque.peekFirst()];

            // Remove indices outside the current window
            while (!deque.isEmpty() &&
                   deque.peekFirst() <= i - k) {
                deque.removeFirst();
            }

            // Maintain decreasing order of values
            while (!deque.isEmpty() &&
                   nums[i] >= nums[deque.peekLast()]) {
                deque.removeLast();
            }

            deque.addLast(i);
        }

        // Store the maximum of the last window
        result[index] = nums[deque.peekFirst()];

        return result
    }
}
