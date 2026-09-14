class Solution {
    public int lastdigits(int n){
        int ld = 0;
        int ans =0;

        while(n>0){
            ld = n %10;
            ans = ans+ (int)Math.pow(ld,2);
            n/=10;
        }
        return ans;
        
    }
    public boolean isHappy(int n) {
        if(n ==1){
            return true;
        }
        else{
            while(n>9){
                n = lastdigits(n);
                if(n==1){
                    return true;
                }
            }
        }
        return false;
    }
}