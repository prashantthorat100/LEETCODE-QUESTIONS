class Solution {

    public int maxEle(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        return max;
    }

    public long CalcTotalHour(int arr[], int hourly) {
        long totalHour = 0;

        for (int i = 0; i < arr.length; i++) {
            totalHour += ((long) arr[i] + hourly - 1) / hourly;
        }

        return totalHour;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int minSpeed = 1;
        int maxSpeed = maxEle(piles);

        while (minSpeed <= maxSpeed) {

            int mid = minSpeed + (maxSpeed - minSpeed) / 2;

            long totalH = CalcTotalHour(piles, mid);

            if (totalH <= h) {
                maxSpeed = mid - 1;
            } else {
                minSpeed = mid + 1;
            }
        }

        return minSpeed;
    }
}