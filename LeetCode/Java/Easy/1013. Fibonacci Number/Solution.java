class Solution {
    public int fib(int n) {
        int num1 = 0;
        int num2 = 1;
        int ith =0;
        for(int i=n;i>=2;i--){
            ith = num1+num2;
            num1 = num2;
            num2 = ith;
        } 

        return ith;
    }
}