class Solution {
    public boolean isPerfectSquare(int num) {
        int min =0;
        int max = num;
        int mid = 0;
        if(num ==1){
            return true;
        }
        while(min <= max) {

            mid = min + (max - min) / 2;
            long square = (long) mid * mid;

            if(square == num) {
                return true;
            }
            else if(square < num) {
                min = mid + 1;
            }
            else {
                max = mid - 1;
            }
        }

        return false;
    }    
}
