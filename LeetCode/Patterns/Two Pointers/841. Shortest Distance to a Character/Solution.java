class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];

        int lastC = -n;

        // Left → Right
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                lastC = i;
            }

            ans[i] = i - lastC;
        }

        // Right → Left
        lastC = 2 * n;

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                lastC = i;
            }

            ans[i] = Math.min(ans[i], lastC - i);
        }

        return ans;
    }
}