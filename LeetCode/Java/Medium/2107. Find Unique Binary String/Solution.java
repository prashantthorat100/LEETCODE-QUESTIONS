class Solution {
    public String findDifferentBinaryString(String[] nums) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {

            // Take diagonal element and flip it
            if (nums[i].charAt(i) == '0') {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }

        return sb.toString();
    }
}