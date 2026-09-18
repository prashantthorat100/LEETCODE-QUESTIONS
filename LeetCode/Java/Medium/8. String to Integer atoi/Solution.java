class Solution {
    public int myAtoi(String s) {

        s = s.trim();

        int sign = 1;
        int ans = 0;
        int i = 0;

        // Handle sign
        if (i < s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } 
        else if (i < s.length() && s.charAt(i) == '+') {
            i++;
        }

        // Read digits
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {

            int digit = s.charAt(i) - '0';

            // Check overflow
            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                if (sign == 1)
                    return Integer.MAX_VALUE;
                else
                    return Integer.MIN_VALUE;
            }

            ans = ans * 10 + digit;
            i++;
        }

        return ans * sign;
    }
}