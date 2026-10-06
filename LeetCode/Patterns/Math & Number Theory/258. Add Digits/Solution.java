class Solution {
    public int findSum(int n,int ld){
        if(n<10){
            return n;
        }
        int sum =0;
        while(n>0){
            ld = n%10;
            sum+=ld;
            n/=10;
        }
        return findSum(sum,sum%10);

    }
    public int addDigits(int num) {
        return findSum(num,0);
    }
}