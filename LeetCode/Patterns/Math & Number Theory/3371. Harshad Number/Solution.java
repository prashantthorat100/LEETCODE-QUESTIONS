class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int hNum = -1;
        int sum = 0;
        int num = x;
        while(x>0){
            int ld = x%10;
            sum += ld;
            x/=10;
        }
        if(num%sum ==0){
            return sum;
        }
        return hNum;
    }
}