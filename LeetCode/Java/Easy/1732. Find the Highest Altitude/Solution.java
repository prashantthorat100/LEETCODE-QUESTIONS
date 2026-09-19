class Solution {
    public int largestAltitude(int[] gain) {
        int altitude[] = new int[gain.length+1];
        altitude[0] = 0;
        int max = Integer.MIN_VALUE;
        for(int i=1;i<altitude.length;i++){
            altitude[i] = gain[i-1] + altitude[i-1];
            
        }
        for(int i=0;i<altitude.length;i++){
            max = Math.max(max, altitude[i]);
        }

        return max;
    }
}