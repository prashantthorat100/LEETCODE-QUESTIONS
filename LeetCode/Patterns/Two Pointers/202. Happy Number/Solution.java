class Solution {
    public int lastdigits(int n) {
        int ld = 0;
        int ans = 0;

        while (n > 0) {
            ld = n % 10;
            ans = ans + ld * ld;
            n /= 10;
        }

        return ans;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = lastdigits(slow);
            fast = lastdigits(lastdigits(fast));
        } while (slow != fast);

        return slow == 1;
    }
}